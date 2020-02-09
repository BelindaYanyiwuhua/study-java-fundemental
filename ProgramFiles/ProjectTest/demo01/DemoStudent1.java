package cn.itcast.day01.demo01;

import java.util.Arrays;

public class DemoStudent1 {
    public static void main(String[] args) {
        Student one =new Student("guojing ",33);
        one.room = "101";
        Student.room = "102";

        System.out.println("姓名：" + one.getName()
                +",年龄:" + one.getAge()+", 学号："+one.getId() + "教室：" + one.room);
        Student two =new Student("huangrong ",29);
        System.out.println("姓名：" + two.getName()
                +",年龄:" + two.getAge()+", 学号："+two.getId()+ "教室：" + two.room);
    }
}
