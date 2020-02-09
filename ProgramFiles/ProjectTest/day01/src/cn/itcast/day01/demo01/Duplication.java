package cn.itcast.day01.demo01;

import java.util.Arrays;

public class Duplication {
    public static boolean duplication(int[] nums, int length, int[] duplication){
        if(nums == null || length == 0){
            return  false;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]){
                duplication[0] = nums[i];
                System.out.println(duplication[0]);
                return true;
            }
        }
        return false;
    }

    public static int[] mutilpy(int[] A){
        int[] B = new int[A.length];
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            temp = A[i];
            A[i] = 1;
            B[i] = 1;
            for (int j = 0; j < A.length; j++) {
                B[i] *= A[j];
            }
            A[i] = temp;
        }
        return B;
    }

    public static String replaceSpace(String str) {
        return str.toString().replace(" ", "%20");
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,2,6};
        int[] du = new int[6];
        System.out.println(duplication(nums,6,du));

        int[][] arrays = new int[3][4];
        System.out.println("输出二维数组行数：" +arrays.length);
        System.out.println("输出二维数组列数：" +arrays[0].length);

        for (int i = 0; i < mutilpy(nums).length; i++) {
            System.out.print(mutilpy(nums)[i]+'\t');
        }

        System.out.println();
        String string = "We Are The Champion!";
        System.out.println(replaceSpace(string));
    }
}
