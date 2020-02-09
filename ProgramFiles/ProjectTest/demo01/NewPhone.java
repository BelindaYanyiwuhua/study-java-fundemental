package cn.itcast.day01.demo01;
//定义新手机，用老手机作为父类
public class NewPhone extends Phone{

    @Override
    public void show() {
        super.show();//使用父类的方法，可以“显示号码”了
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
