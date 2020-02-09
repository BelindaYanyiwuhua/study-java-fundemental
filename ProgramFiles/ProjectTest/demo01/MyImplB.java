package cn.itcast.day01.demo01;

public class MyImplB implements MyInterface {
    //重写接口的抽象方法
    @Override
    public void method() {
        System.out.println("实现类B重写接口的抽象方法");
    }
    //重写接口的默认方法
    @Override
    public void methodDefault() {
        System.out.println("实现类B重写接口的默认方法");
    }
}
