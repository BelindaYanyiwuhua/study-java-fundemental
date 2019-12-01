import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arrayA = new int[5];//动态初始化数组,默认值是0
        int[] arrayB = new int[]{ 3,5,9,1 };
        int[][] arrayK =new int[3][4];
        for(int i=0;i<arrayK.length;i++){
            for(int j=0;j<arrayK[0].length;j++){
                arrayK[i][j]=j;
            }
        }
        Arrays.sort(arrayB);



        String[] arrayC = new String[3];//默认值是null

        char[] arrayD = new char[4];

        System.out.println("arrayA:");
        for(int i:arrayA) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("arrayB:");
        for(int i:arrayB) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("arrayC:");
        for(String i:arrayC) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("arrayD:");
        for(char i:arrayD) {
            System.out.print(i+"\t");
        }

        for(int i=0;i<arrayK.length;i++){
            for(int j=0;j<arrayK[0].length;j++){
                System.out.print(arrayK[i][j]+"\t");
            }
        }

        //数组最大值
        int [] array = new int[]{5,15,30,20,10000};
        int max =array[0];
        int min =array[0];
        for(int i=1;i<array.length-1;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=1;i<array.length-1;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("数组最大值："+max);
        System.out.println("数组最小值："+min);
    }
}
