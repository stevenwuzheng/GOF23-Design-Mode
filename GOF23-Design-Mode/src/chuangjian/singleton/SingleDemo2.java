package chuangjian.singleton;

/*
* 懒汉式单例
* */
public class SingleDemo2 {

    private static SingleDemo2 instance;

    //私有化构造器
    private SingleDemo2() {}

    public static synchronized SingleDemo2 shared() {
        if (instance == null) {
            instance = new SingleDemo2();
        }
        return instance;
    }


}
