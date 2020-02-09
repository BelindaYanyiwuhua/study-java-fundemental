package cn.itcast.day01.demo01;

public class DemoInterface {
    public static void main(String[] args) {
        //创建实现类对象，并调用抽象方法和默认方法
        MyImplA  myImplA = new MyImplA();
        myImplA.method();
        myImplA.methodDefault();

        //创建实现类对象，并调用重写的抽象方法和重写的默认方法
        MyImplB myImplB = new MyImplB();
        myImplB.method();
        myImplB.methodDefault();
        //直接用接口名称调用接口中定义的静态方法
        MyInterface.methodStatic();
    }
}
