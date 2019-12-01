package cn.itcast.day01.demo01;
import java.util.ArrayList;
import java.util.Random;

public class DemoArrayList {

    /**
     * 打印集合格式为{20@435@14}
     * 参数：ArrayList<String>
     * 返回值为空
     */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size() ; i++) {
            String str = list.get(i);
            if(i == list.size()-1){
                System.out.println(str + "}");
            }else {
                System.out.print(str +"@");
            }
        }
    }



    public static void main(String[] args) {
        /**
         * 创建一个ArrayList集合，集合的名称是list,
         * 里面存储的都是String字符串类型的数据
         * JDK1.7之后右侧尖括号里面可以不写内容
         */
        ArrayList<String> list =new ArrayList<>();
        System.out.println("初始集合：" + list);
        //添加数据
        list.add("小胡");
        list.add("胡文颖");
        boolean sucess = list.add("女生");
        list.add("江西");
        System.out.println("添加数据后：" + list);
        System.out.println("第2号索引位置：" + list.get(1));
        System.out.println("元素个数：" + list.size());
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        //删除集合中的对应索引值的元素
        list.remove(1);
        System.out.println();
        System.out.print(list);

        /**
         * 存储基本类型的数据
         * 练习题:生成1-33之间的随机数，添加到集合中，并遍历集合。
         */
        ArrayList <Integer> listA = new ArrayList<>();
        Random random = new Random();
        //生成随机数并添加进集合
        for(int i=0; i<6 ; i++){
            int number = random.nextInt(33)+1;
            listA.add(number);
        }
        //遍历集合
        for (int i = 0; i < listA.size(); i++) {
            System.out.print(listA.get(i) + "\t");
        }
        System.out.println();

        /**
         * 练习题：自定义4个学生对象，添加到集合，并遍历
         */
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = new Student("小胡",22);
        Student stu2 = new Student("小朱",21);
        Student stu3 = new Student("小黄",24);
        Student stu4 = new Student("小郑",23);

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        System.out.println("姓名\t年龄\t");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName()+"\t"
                    +students.get(i).getAge()+"\n");
        }

        /**
         * 调用规定格式打印集合
         */
        ArrayList<String> list2 =new ArrayList<>();
        list2.add("老师");
        list2.add("医生");
        list2.add("警察");
        printArrayList(list2);


        /**
         * 筛选偶数元素
         */
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        /**
         * 遍历输出大集合
         */
        System.out.println("大集合元素为：");
        for (int i = 0; i < bigList.size(); i++) {
            if(i == bigList.size() -1){
                System.out.print(bigList.get(i)+"\n");
            }
            else{
                System.out.print(bigList.get(i)+"\t");
            }
        }
        ArrayList<Integer> smallList = getSmallList(bigList);
        /**
         * 遍历小集合
         */
        System.out.println("筛选大集合偶数元素，输出小集合元素：");
        for (int i = 0; i < smallList.size(); i++) {
            if(i == smallList.size() -1){
                System.out.print(smallList.get(i)+"\n");
            }
            else{
                System.out.print(smallList.get(i)+"\t");
            }
        }

    }
    /**
     * 题目描述：一个大集合中存入20个随机数字，自己设定范围是1-100
     * 筛选其中的偶数元素，存放到小集合中。
     * 随机数字用Random nextInt
     * 定义一个筛选方法：
     * 返回值类型：ArrayList小集合
     * 方法名称：getSmallList
     * 参数列表：ArrayList大集合
     */
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if(bigList.get(i) % 2 == 0){
                smallList.add(bigList.get(i));
            }
        }
        return smallList;
    }
}
