package chuangjian.factory.FactoryMethod;

public class BydiFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new Bydi();
    }
}
