package xingwei.observer.javaObserver;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Observer observer3 = new ConcreteObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setMoney(100);

        System.out.println("----------- 移除观察者2 ---------------");
//        subject.removeObserver(observer2);
        subject.deleteObserver(observer2);

        subject.setMoney(200);

    }
}
