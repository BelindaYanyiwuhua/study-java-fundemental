package cn.itcast.day01.demo01;
import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {
        Random random = new Random();
        //设定取值范围在[1,n]
        //可以通过[0,n)+1来实现
        //每输出10个数字换行
        int n = 5;
        for (int i = 0; i < 100; i++) {
            int result = random.nextInt(n) + 1;
            if(i % 9 == 0){
                System.out.println();
            }
            else {
                System.out.print(result+"\t");
            }
        }

        /**
         * 猜数字游戏
         */
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(100) + 1;
        while(true){
            System.out.println("请输入你猜测的数字：");
            int guess = sc.nextInt();
            if(guess > randomNum){
                System.out.println("猜想数字太大，请重新输入！：");
            }else if(guess < randomNum){
                System.out.println("猜想数字太小，请重新输入！：");
            }else{
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
