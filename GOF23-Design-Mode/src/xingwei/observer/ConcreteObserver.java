package xingwei.observer;

public class ConcreteObserver implements Observer {

    private int money;

    @Override
    public void update(Subject subject) {
        ConcreteSubject sub = (ConcreteSubject)subject;
        System.out.println("----观察者内存地址:" + System.identityHashCode(this) + " 发钱了：old=" + this.money +  " new:" + sub.getMoney());
        this.money = sub.getMoney();
    }
}
