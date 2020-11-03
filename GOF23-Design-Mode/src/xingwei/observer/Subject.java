package xingwei.observer;

import java.util.ArrayList;
import java.util.List;

//被观察者-抽象类，可以没有抽象方法，但不能直接实例化对象
public abstract class Subject {

    private List<Observer> list = new ArrayList();

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer obs : list) {
            obs.update(this);
        }
    }


}
