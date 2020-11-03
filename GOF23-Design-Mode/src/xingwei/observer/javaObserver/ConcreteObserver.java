package xingwei.observer.javaObserver;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    private int money;

    @Override
    public void update(Observable obs, Object arg) {
        ConcreteSubject sub = (ConcreteSubject)obs;
        System.out.println("----观察者内存地址:" + System.identityHashCode(this) + " 发钱了：old=" + this.money +  " new:" + sub.getMoney());
        this.money = sub.getMoney();
    }
}
