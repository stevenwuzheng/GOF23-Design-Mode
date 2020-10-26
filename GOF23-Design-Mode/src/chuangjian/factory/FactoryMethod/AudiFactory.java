package chuangjian.factory.FactoryMethod;

public class AudiFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new Audi();
    }
}
