package jiegou.decorator;

public class FlyCar extends DecoratorCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("能飞上天的car");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
