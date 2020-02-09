package cn.itcast.day01.demo01;

public class MyImplA implements MyInterface {
    //重写接口的抽象方法
    @Override
    public void method() {
        System.out.println("实现类A重写接口的抽象方法");
    }
}
