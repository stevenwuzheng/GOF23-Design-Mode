package chuangjian.builder;

public class AudiBuilder implements CarBuilder {
    @Override
    public Engine buildEngine() {
        Engine engine = new Engine();
        engine.setName("Audi");
        return engine;
    }

    @Override
    public Tire buildTire() {
        Tire tire = new Tire();
        tire.setName("Audi");
        return tire;
    }

}
