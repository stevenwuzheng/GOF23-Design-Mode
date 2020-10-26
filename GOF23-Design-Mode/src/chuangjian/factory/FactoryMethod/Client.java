package chuangjian.factory.FactoryMethod;

public class Client {

    public static void main(String[] args) {

        ICar car1 = new AudiFactory().createCar();
        car1.run();

        ICar car2 = new BydiFactory().createCar();
        car2.run();
    }

}
