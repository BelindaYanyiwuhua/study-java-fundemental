package edu.zju.cst.myproject;

public class User {
    public Integer id;
    public String name;
    public String address;
    public String sayHello(String guestName){
        return "Hello "+ guestName;
    }
}
