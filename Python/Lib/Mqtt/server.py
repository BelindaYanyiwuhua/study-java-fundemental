import paho.mqtt.client as mqtt
import base64

HOST = "192.168.1.42"
PORT = 1883

imgType_list = {'jpg','bmp','png','jpeg','rgb','tif'}

def on_connect(client, userdata, flags, rc):
    print("Connected with result code " + str(rc))

    client.subscribe('传输文件名')
    client.subscribe('发送数据')


def on_message(client, userdata, msg):
    print(msg.topic + ' ' + str(msg.payload, 'utf-8'))
    global filename
    if msg.topic == '传输文件名':
        filename = str(msg.payload, 'utf-8')
    if msg.topic == '发送数据':
        if (filename == None):
            client.publish('error', '请传输文件名')
        else:
            # 图片类型
            if filename.split('.')[-1] in imgType_list:
                f = open('receive/' + filename, 'wb')
                f.write(base64.b64decode(str(msg.payload, 'utf-8')))
                f.close()
            # 文本类型
            else:
                f = open('receive/' + filename, 'w')
                f.write(str(msg.payload, 'utf-8'))
                f.close()


if __name__ == '__main__':
    client = mqtt.Client()
    HOST = "192.168.1.42"

    filename = None
    # 用户认证
    client.username_pw_set('server _ll', '123456')
    client.on_connect = on_connect
    client.on_message = on_message

    # 连接请求
    client.connect(HOST, 1883, 60)

    client.loop_forever()
