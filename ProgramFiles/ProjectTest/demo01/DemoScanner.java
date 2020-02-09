package cn.itcast.day01.demo01;
import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        //Scanner实现键盘输入sc
        //System.in表示键盘输入
        Scanner sc = new Scanner(System.in);
        //获取键盘输入的一个int数字
        int num = sc.nextInt();
        //获取键盘输入的一个字符串
        String str = sc.next();
        System.out.println(num+"\n"+str);

        System.out.println("输入两个数字求和：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("num1:"+num1+"\n"
        +"num2:"+num2+"\n"+"num1+num2="+(num1+num2));

        System.out.println("输入3个数字求最大值：");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        int temp = num3 > num4 ? num3 : num4;
        int max = temp > num5 ? temp : num5;
        System.out.println("最大数是：" + max);

        //匿名对象的方式
        int number = new Scanner(System.in).nextInt();
        System.out.println("输入的是：" + number);
    }
}
