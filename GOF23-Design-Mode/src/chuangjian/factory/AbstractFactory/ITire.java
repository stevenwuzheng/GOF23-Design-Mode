package chuangjian.factory.AbstractFactory;

public interface ITire {
    void run();
}

class  HighTire implements ITire {

    @Override
    public void run() {
        System.out.println("高端轮胎---耐磨损");
    }
}


class LowTire implements ITire {

    @Override
    public void run() {
        System.out.println("低端轮胎---易磨损");
    }
}
