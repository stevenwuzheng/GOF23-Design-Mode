package xingwei.strategy;

public class BigCustomer implements Strategy {
    @Override
    public double getGoodsPrice(double originPrice) {
        System.out.println("大客户打8折");
        return originPrice * 0.8;
    }
}
