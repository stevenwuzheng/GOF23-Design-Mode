package jiegou.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ViewController implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---来到了代理ViewController的回调方法中：" + "\n代理对象proxy(肯定是viewcontroller自己了):" + "\nmethod:" + method.toString() + "\nargs:" + args);

        if (method.getName().equals("numberOfSectionsInTableView")){
            return 100;
        } else {
            //调用该方法的返回值
            return null;
        }
    }

}
