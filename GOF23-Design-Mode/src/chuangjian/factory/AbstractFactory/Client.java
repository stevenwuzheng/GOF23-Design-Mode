package chuangjian.factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {

        IFactory fac1 = new HighFactory();
        IEngine fac1Engine = fac1.createEngine();
        fac1Engine.start();
        ITire fac1Tire = fac1.createTire();
        fac1Tire.run();

        LowFactory fac2 = new LowFactory();
        IEngine fac2Engine = fac2.createEngine();
        fac2Engine.start();
        ITire fac2Tire = fac2.createTire();
        fac2Tire.run();

    }

}
