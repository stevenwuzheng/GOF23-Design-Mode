package chuangjian.factory.SimpleFactory;

public class Factory {

    public static ICar createCar(int type) {

        ICar car = null;
        switch (type) {
            case 1:
                car = new Audi();
                break;
            case 2:
                car = new Bydi();
        }

        return car;
    }

}
