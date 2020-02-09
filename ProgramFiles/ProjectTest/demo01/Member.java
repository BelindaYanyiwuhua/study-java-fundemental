package cn.itcast.day01.demo01;

import java.util.ArrayList;
import java.util.Random;
//普通成员
public class Member  extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个，给自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且获得被删除的红包
        int delta = list.remove(index);
        //当前成员自己的本来金额,重新设置金额
        int money = super.getMoney();
        super.setMoney(money + delta);

    }
}
