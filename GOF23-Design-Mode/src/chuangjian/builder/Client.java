package chuangjian.builder;

public class Client {
    public static void main(String[] args) {
        AudiDirector director = new AudiDirector();
        Car car = director.directorCar();
        System.out.println("car.getEngine().getName() = " + car.getEngine().getName());
        System.out.println("car.getTire().getName() = " + car.getTire().getName());
    }
}
