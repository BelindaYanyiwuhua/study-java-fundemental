import java.util.Arrays;

public class DemoArrayReverse {
    /**
     * 方法：打印数组pintArray
     * 参数列表：数组，int[] array
     * 返回值类型：void
     * @param args
     */
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println(array);
    }

    /**
     * 返回值类型：数组
     * calculate方法：计算总和和平均值
     * @param args
     */
    public static  int[] calculate(int a,int b, int c){
        int sum =a + b + c;
        int avg =sum / 3;
        int[] array =new int[]{sum, avg};
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{11,23,74,21,90,22};
        //遍历数组，输出最初数组
        System.out.println("原始数组：");
        printArray(array);
        System.out.println();
        System.out.println("数组反转：");
        //元素交换
        for(int min=0,max = array.length-1; min<max; min++,max--){
            int temp =array[min];
            array[min]= array[max];
            array[max]= temp;
        }
        //反转数组输出
       printArray(array);

        //计算平均数，总和
        int[] result = calculate(12,24,36);
        System.out.println("总和:" + result[0]);
        System.out.println("平均数:" + result[1]);
        System.out.println(Arrays.toString(result));
    }
}
