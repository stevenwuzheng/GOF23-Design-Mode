package jiegou.bridge;

public class Client {
    public static void main(String[] args) {
        //创建 dell 笔记本
        Laptop laptop = new Laptop(new Dell());
        laptop.showInfo();

        //创建 联想台式机
        Desktop desktop = new Desktop(new Lenovo());
        desktop.showInfo();
    }
}
