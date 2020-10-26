package jiegou.proxy.staticProxy;

//客户想要找周杰伦唱歌，周杰伦说我只负责唱歌，其他的事情你找我经纪人谈吧
public class Client {

    /*
     * 安卓中的反射动态代理应用场景(主要是AOP)：如蓝牙管理者类BluetoothManager(必须有个接口，代理只认有接口的类)已经写好了，此时想要对其中的方法加上log日志
     * 此时新建一个proxyInvocationHandler类，然后创建一个动态代理，DelegateBluetoothManager类，以后原本调用BluetoothManager类的地方，全部改调用DelegateBluetoothManager类即可
     * */
    public static void main(String[] args) {

        //Client  代表 客户

        RealSinger realSinger = new RealSinger();  //周杰伦

        ProxySinger proxySinger = new ProxySinger(realSinger); //经纪人
        proxySinger.discussPrice();
        proxySinger.signContract();
        proxySinger.sing();
        proxySinger.collectMoney();
    }

}
