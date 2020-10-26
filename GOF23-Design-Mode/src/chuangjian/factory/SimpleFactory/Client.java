package chuangjian.factory.SimpleFactory;

public class Client {

    public static void main(String[] args) {

        ICar car1 = Factory.createCar(1);
        car1.run();

        ICar car2 = Factory.createCar(2);
        car2.run();
    }
    
}
