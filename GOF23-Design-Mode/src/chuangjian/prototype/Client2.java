package chuangjian.prototype;

import java.util.Date;

public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date(1245689693); //date是个对象
        Sheep2 sheep = new Sheep2("多利",date);
        System.out.println("Sheep = " + sheep);

        Sheep2 clone = (Sheep2) sheep.clone();
        clone.setName("深复制多利");
        System.out.println("clone = " + clone);

        System.out.println("------------------");
//        date = new Date(234567899);
        date.setTime(234567899);
        
        System.out.println("sheep = " + sheep);
        System.out.println("clone = " + clone);

    }
}
