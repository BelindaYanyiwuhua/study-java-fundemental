import paho.mqtt.client as mqtt
import base64

HOST = "192.168.1.42"
PORT = 1883


def on_connect(client, userdata, flags, rc):
    print("Connected with result code " + str(rc))
    client.subscribe('error')


def on_message(client, userdata, msg):
    print(msg.topic + ' ' + str(msg.payload, 'utf-8'))


if __name__ == '__main__':
    client = mqtt.Client()
    HOST = "192.168.1.42"

    # 用户认证
    client.username_pw_set('client _ll', '123456')
    client.on_connect = on_connect
    client.on_message = on_message

    # 连接请求
    client.connect(HOST, 1883, 60)

    f_txt = open('send/test.txt', 'rb')
    send_txt = f_txt.read()

    f_image = open('send/test.jpg', 'rb')
    send_image = base64.b64encode(f_image.read())

    # 传输文本文件
    client.publish('传输文件名', 'send/test.txt')
    client.publish('发送数据', send_txt)

    # 传输图片
    client.publish('传输文件名', 'send/test.jpg')
    client.publish('发送数据', send_image)

    client.loop_forever()
