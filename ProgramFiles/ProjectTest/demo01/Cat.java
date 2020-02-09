package cn.itcast.day01.demo01;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void play() {
        System.out.println("猫玩球");
    }
}
