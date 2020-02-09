package cn.itcast.day01.demo01;

/**
 * 定义一个Student类
 */
public class Student {
    /**
     * 成员变量（属性）
     */
    private int id;
    private String name;
    private int age;
    static String room;//所在教室
    private static int idCounter = 0;//学号计数器，计数器++
    /**
     * 使用快捷键Alter+Insert，自动生成构造函数和Getter，Setter方法
     */
    public Student() {
        this.idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 成员方法（行为）
     */
    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

    public void sayHello(String name){
        System.out.println(name+ "你好，我是"+this.name);
        System.out.println(this);
    }
}
