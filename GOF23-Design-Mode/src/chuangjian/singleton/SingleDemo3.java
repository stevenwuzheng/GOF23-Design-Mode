package chuangjian.singleton;

/*
* 利用静态内部类来创建单例
* */
public class SingleDemo3 {

    private static class InnerClass {
        private static final SingleDemo3 instance = new SingleDemo3();
    }

    //私有化构造器
    private SingleDemo3(){}

    public static SingleDemo3 shared() {
        return InnerClass.instance;
    }

}
