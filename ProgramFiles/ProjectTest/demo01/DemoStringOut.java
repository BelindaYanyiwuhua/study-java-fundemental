package cn.itcast.day01.demo01;

import java.util.Scanner;

public class DemoStringOut {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int countUpper = 0;
        int countLower = 0;
        int countOther = 0;

        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if('A' <= charArray[i]&& charArray[i] <= 'Z'){
                countUpper++;
            }else if('a' <= charArray[i]&& charArray[i] <= 'z'){
                countLower++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有：" +countUpper+ "个");
        System.out.println("小写字母有：" +countLower+ "个");
        System.out.println("其他字符有：" +countOther+ "个");
    }
}
