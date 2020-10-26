package chuangjian.prototype;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date(1245689693); //date是个对象
        Sheep sheep = new Sheep("多利",date);
        System.out.println("sheep = " + sheep);

        Sheep clone = (Sheep) sheep.clone();
        clone.setName("浅复制多利");
        System.out.println("clone = " + clone);

        System.out.println("------------------");
//        date = new Date(234567899);
        date.setTime(234567899);

        System.out.println("sheep = " + sheep);
        System.out.println("clone = " + clone);

    }
}
