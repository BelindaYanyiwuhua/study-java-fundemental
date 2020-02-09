package cn.itcast.day01.demo01;

public class DemoString {
    public static void main(String[] args) {
        /**
         * 三种构造方法
         */
        String str1 = new String();
        System.out.println(str1);

        char[] array = new char[]{'A','B','C','D'};
        String str2 = new String(array);
        System.out.println(str2);

        byte[] bytes = new byte[]{97,98,99};
        String str3 = new String(bytes);
        System.out.println(str3);

        /**
         * 三种常用方法
         */
        int length = "defwwefwefaxzfgr".length();
        System.out.println("字符串的长度是："+length);

        String str4 = "Good ";
        String str5 = "Morning!";
        String str6 = str4.concat(str5);
        System.out.println("str4:"+str4);
        System.out.println("str5:"+str5);
        System.out.println("str6:"+str6);

        char c ="Hello".charAt(4);
        System.out.println("在4号索引位置的是："+c);
        System.out.println("Hello".indexOf("llo"));
        System.out.println("Hello".indexOf("t"));

        System.out.println("str6从2号索引位置开始：" + str6.substring(2));
        System.out.println("str6从2号索引位置开始，在7号结束" + str6.substring(2,7));

        //转换为字符数组
        char[] chars = str6.toCharArray();
        System.out.println(chars[1]);
        System.out.println(chars.length);

        //转换为字节数组
        byte[] bytes1 = str6.getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.print(bytes1[i] + "\t");
        }
        System.out.println();

        System.out.println(str6.replace("o","*"));

        String[] str7 = str6.split(" ");
        for (int i = 0; i < str7.length; i++) {
            System.out.println(str7[i]);
        }
    }
}
