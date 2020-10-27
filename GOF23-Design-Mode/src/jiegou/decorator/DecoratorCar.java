package jiegou.decorator;

/*
* 装饰器 decorator 或者 wrapper
* */
public class DecoratorCar implements ICar {

    protected ICar car;

    public DecoratorCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

