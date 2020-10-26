package jiegou.proxy.staticProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ViewController implements UITableViewDelegate {

    @Override
    public int numberOfSectionsInTableView(UITableView tv) {
        System.out.println("---来到了UITableView代理对象ViewController(实现了UITableViewDelegate协议中方法的对象就认为是代理对象) 预先实现的代理方法中：numberOfSectionsInTableView");
        return 100;
    }


}
