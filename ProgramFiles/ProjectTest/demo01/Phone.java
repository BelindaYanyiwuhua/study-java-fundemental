package cn.itcast.day01.demo01;

/**
 * 手机类
 */
public class Phone {
    private String brand;
    private double price;
    private String color;

    /**
     * 本类的无参构造方法调用本类的有参构造方法。
     * 在构造方法Phone()中，调用了全参构造方法Phone(String brand, double price, String color)
     */
    public Phone() {
        this("de",1200,"red");
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void call(String name){
        System.out.println("打电话给："+name);
        this.show();
    }

    public void sendMessage(String name){
        System.out.println("发短信给："+name);
    }

    public void show(){
        System.out.println("显示号码");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }else {
            System.out.println("手机价格设置不合理！");
        }

    }
    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
