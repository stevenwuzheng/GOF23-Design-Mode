package jiegou.decorator;

public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("会在陆地上move的小汽车");
    }

}
