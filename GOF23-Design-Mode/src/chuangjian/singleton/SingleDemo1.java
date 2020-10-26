package chuangjian.singleton;

/*
* 恶汉式 单例
* */
public class SingleDemo1 {

    private static SingleDemo1  instance = new SingleDemo1();

    //私有化构造器
    private SingleDemo1(){ }

    public static SingleDemo1 shared() {
        return instance;
    }

}
