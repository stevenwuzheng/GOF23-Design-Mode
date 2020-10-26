package chuangjian.factory.AbstractFactory;

public interface IFactory {
    IEngine createEngine();
    ITire   createTire();
}


class HighFactory implements IFactory {
    @Override
    public IEngine createEngine() {
        return new HighEngine();
    }

    @Override
    public ITire createTire() {
        return new HighTire();
    }
}


class LowFactory implements IFactory {
    @Override
    public IEngine createEngine() {
        return new LowEngine();
    }

    @Override
    public ITire createTire() {
        return new LowTire();
    }
}