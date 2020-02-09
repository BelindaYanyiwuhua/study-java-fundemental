package cn.itcast.day01.demo01;

public class User {//用户类
    private String name;//用户姓名
    private int money;//余额

    //无参构造函数
    public User() {
    }

    //全参构造函数
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show(){
        System.out.println("我是：" + name + ",我的余额是：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
