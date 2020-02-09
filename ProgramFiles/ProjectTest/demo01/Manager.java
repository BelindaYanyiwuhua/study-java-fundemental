package cn.itcast.day01.demo01;
import java.util.ArrayList;

public class Manager extends User{
    public Manager(){
    }

    //调用父类的构造方法
    public Manager(String name, int money) {
        super(name, money);
    }

    /**
     *
     * @param totalmoney
     * @param count
     * @return ArrayList<Integer> 对金额进行拆分，成为集合，比如一份钱分为三份
     */
    public ArrayList<Integer> send(int totalmoney, int count){
        //创建一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();//群主当前余额
        if(totalmoney > leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }
        //扣钱，重新设置金额（从群主的余额中扣除红包的总金额），调用父类中有set的方法
        super.setMoney(leftMoney - totalmoney);

        //发红包需要平均拆分为count份，会有余数，塞进最后一个红包
        int avg = totalmoney / count;
        int mod = totalmoney % count;//余数，剩余的全部塞进最后一个红包

        //将平均的钱avg放进红包，注意循环次数，最后一个红包特殊处理，count-1
        for (int i = 0; i < count - 1 ; i++) {
            redList.add(avg);
        }
        int last = avg + mod;//最后一个红包的金额是avg+mod
        redList.add(last);

        return redList;
    }
}
