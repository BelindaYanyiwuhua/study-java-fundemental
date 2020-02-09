package cn.itcast.day01.demo01;

import java.util.ArrayList;

public class MainRedList {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();

        //群主发20元红包，分三个
        ArrayList<Integer> redList = manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
