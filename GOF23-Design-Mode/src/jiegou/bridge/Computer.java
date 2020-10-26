package jiegou.bridge;

public class Computer {

    //这就是那座桥(接口)
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    void showInfo() {
        brand.showInfo();
    }

}

class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("以上是台式机");
    }
}

class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("以上是笔记本电脑");
    }

}