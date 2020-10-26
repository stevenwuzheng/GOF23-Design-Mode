package jiegou.proxy.staticProxy;

public class RealSinger implements Singer {
    @Override
    public void discussPrice() {
        System.out.println("真实歌星只负责唱歌，一般不负责谈价钱，discussPrice");
    }

    @Override
    public void signContract() {
        System.out.println("真实歌星只负责唱歌，一般不负责签合同，signContract");
    }

    @Override
    public void sing() {
        System.out.println("真实歌星(周杰伦)开始唱歌，肯定是经纪人(代理)安排他去唱歌的");
    }

    @Override
    public void collectMoney() {
        System.out.println("真实歌星只负责唱歌，一般不负责收尾款，collectMoney");
    }
}
