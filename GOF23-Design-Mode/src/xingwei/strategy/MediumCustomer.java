package xingwei.strategy;

public class MediumCustomer implements Strategy {
    @Override
    public double getGoodsPrice(double originPrice) {
        System.out.println("中型客户打9折");
        return originPrice * 0.9;
    }
}
