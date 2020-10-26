package jiegou.proxy.staticProxy;

public class ProxySinger implements Singer {

    private RealSinger realSinger;

    public ProxySinger(RealSinger realSinger) {
        this.realSinger = realSinger;
    }

    @Override
    public void discussPrice() {
        System.out.println("经纪人不会唱歌，负责谈价格，discussPrice");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人不会唱歌，负责签合同，signContract");
    }

    @Override
    public void sing() {
        System.out.println("经纪人不会唱歌，别人找经纪人谈价钱签合同后，经纪人安排真实歌星去唱歌的");
        this.realSinger.sing(); //真实角色才能唱歌
    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人不会唱歌，负责收尾款，collectMoney");
    }
}
