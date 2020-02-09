package cn.itcast.day01.demo01;

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        int[] intArray ={32,66,21,90,82};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        /**
         * 题目描述：
         * 使用Arrays相关的API，将一个随机字符串的所有字符升序排列，并倒序打印。
         **/
        String str ="aefbiuwrefh43y683r7gof3gb@8r20/";
        /**
         * 升序排列：用sort方法
         * sort方法使用：必须是数组，Arrays.sort(数组)
         * String-->数组，用toCharArray
         */
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + "\t");
        }
        System.out.println();
        /**
         * Math的静态方法使用：
         * abs,ceil,floor,round
         * 绝对值，向上取整，向下取整，四舍五入
        */
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.abs(3.14));
        System.out.println(Math.ceil(3.18));
        System.out.println(Math.floor(3.18));
        System.out.println(Math.round(3.18));
        System.out.println(Math.round(3.55));
    }
}
