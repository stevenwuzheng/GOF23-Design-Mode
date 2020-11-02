package xingwei.strategy;

public class Context {

    private Strategy strategy;

    //也可以利用spring配置文件注入
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void invokeStrategy(double price) {
        System.out.println("原价" + price + "最终价格：" + strategy.getGoodsPrice(price));
    }
}
