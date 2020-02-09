package cn.itcast.day01.demo01;

public interface MyInterface {
    //抽象方法
    public abstract void method();

    //默认方法1
    public default void methodDefault(){
        System.out.println("我是接口新添加的默认方法");
        methodPrivate();
    }

    //默认方法2
    public default void methodDefault2(){
        System.out.println("我是接口新添加的默认方法");
        methodPrivate();
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("我是接口的静态方法");
        methodPrivate2();
    }

    //普通私有方法，可以在默认方法中调用
    private void methodPrivate(){
        System.out.println("接口的普通私有方法");
    }

    //静态私有方法，可以在静态方法中调用
     private static void methodPrivate2(){
        System.out.println("接口的静态私有方法");
    }
}
