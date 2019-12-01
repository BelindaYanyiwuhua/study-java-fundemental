package cn.itcast.day01.demo01;

public class DemoPhone {
    public static void main(String[] args) {
        Phone phone =new Phone();
        phone.setBrand("Honor");
        phone.setPrice(3899);
        phone.setColor("red");
        System.out.println(phone.getBrand()+"\t"+
                phone.getPrice()+"\t"+
                phone.getColor());
        phone.call("family");
        phone.sendMessage("friend");
    }
}
