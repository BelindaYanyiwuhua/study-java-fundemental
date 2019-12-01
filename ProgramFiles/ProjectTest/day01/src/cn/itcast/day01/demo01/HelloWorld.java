package cn.itcast.day01.demo01;

public class HelloWorld {
    public static int sum(int a ,int b){
        System.out.print("两个int类型相加结果：");
        return a + b;
    }

    public static double sum(double a ,double b){
        System.out.print("两个double类型相加结果：");
        return a + b;
    }

    public static short sum(short a ,short b){
        System.out.print("两个short类型相加结果：");
        return (short)(a + b);
    }

    public static long sum(long a ,long b){
        System.out.print("两个long类型相加结果：");
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(10L,20L));
        System.out.println(sum(1,3));
        System.out.println(sum(12.4,12.9));
        System.out.println(sum((short)1,(short)2));
        
    }
}
