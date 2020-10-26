package chuangjian.factory.AbstractFactory;

public interface IEngine {
    void start();
}

class HighEngine implements IEngine {

    @Override
    public void start() {
        System.out.println("高端发动机---启动快");
    }
}

class LowEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("低端发动机---启动慢");
    }
}