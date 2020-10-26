package jiegou.proxy.dynamicProxy;

import java.lang.reflect.Proxy;
/*
* 安卓中的反射动态代理应用场景(主要是AOP)：如蓝牙管理者类BluetoothManager(必须有个接口，代理只认有接口的类)已经写好了，此时想要对其中的方法加上log日志
* 此时新建一个proxyInvocationHandler类，然后创建一个动态代理，DelegateBluetoothManager类，以后原本调用BluetoothManager类的地方，全部改调用DelegateBluetoothManager类即可
* */
public class UITableView {

    public void reloadData() {

        ViewController controller = new ViewController();
        ///To create a proxy for some interface 为接口提供动态代理
        UITableViewDelegate delegate = (UITableViewDelegate) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{UITableViewDelegate.class}, controller);
        int sections = delegate.numberOfSectionsInTableView(this);
        System.out.println("---sections = " + sections);

    }


}
