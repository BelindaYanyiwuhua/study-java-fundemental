import cn.itcast.day01.demo01.Student;

public class DemoStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("小朱");
        student1.setAge(20);
        System.out.println("姓名：" + student1.getName() +
                ",年龄：" + student1.getAge());

        Student student2 =new Student("小胡",19);
//        student2.setAge(22);
        System.out.println("姓名：" + student2.getName() +
                ",年龄：" + student2.getAge());

        System.out.println(student2.getClass());
        student2.eat();
        student2.sleep();
        student1.sayHello("胡文颖");
        System.out.println(student2);

        /**
         * 定义一个数组，存储3个Student对象
         * 数组缺点：一旦创建，程序运行期间长度不可以发生改变
         */
        Student[] array = new Student[3];
        Student st1 = new Student("name1",13);
        Student st2 = new Student("name2",14);
        Student st3 = new Student("name3",18);

        array[0] = st1;
        array[1] = st2;
        array[2] = st3;

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i].getName());
            System.out.println(array[i].getAge());
        }
    }
}
