package jiegou.decorator;

public class WaterCar extends DecoratorCar {
    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("能在水里游的car");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }

}
