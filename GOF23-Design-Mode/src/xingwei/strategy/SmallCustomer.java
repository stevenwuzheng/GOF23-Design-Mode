package xingwei.strategy;

public class SmallCustomer implements Strategy {
    @Override
    public double getGoodsPrice(double originPrice) {
        System.out.println("小客户不打折，原价");
        return originPrice;
    }
}
