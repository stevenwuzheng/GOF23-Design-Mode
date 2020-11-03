package xingwei.observer;

//Concrete 是具体的意思， 和abstract抽象相对应
public class ConcreteSubject extends Subject {
    private int money = 0;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        System.out.println("被观察者的钱变化了：old=" + this.money +  " new:" + money);
        this.money = money;
        //调用父类方法：通知所有观察者
        this.notifyAllObserver();
    }
}
