package chuangjian.builder;

public class AudiDirector implements CarDirector {
    @Override
    public Car directorCar() {

        AudiBuilder builder = new AudiBuilder();
        Engine engine = builder.buildEngine();
        Tire tire = builder.buildTire();

        Car car = new Car();
        car.setEngine(engine);
        car.setTire(tire);

        return car;
    }
}
