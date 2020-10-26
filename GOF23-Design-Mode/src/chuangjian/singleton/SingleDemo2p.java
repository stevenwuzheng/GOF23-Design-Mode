package chuangjian.singleton;

/*
* 懒汉式单例
* */
public class SingleDemo2p {

    private static volatile SingleDemo2p instance;

    //私有化构造器
    private SingleDemo2p() {}

//    public static SingleDemo2p shared() {
//        if (instance == null) {
//            //2个线程可能同时来到这里，A线程加把锁进去执行，A出来后，B线程又加锁进去执行一遍
//            synchronized (SingleDemo2p.class) {
//                instance = new SingleDemo2p();
//            }
//        }
//        return instance;
//    }


    public static SingleDemo2p shared() {
        if (instance == null) {
            //2个线程可能同时来到这里，A线程加把锁进去执行，A出来后，B线程又加锁进去执行一遍
            synchronized (SingleDemo2p.class) {
                if (instance == null) {
                    instance = new SingleDemo2p();
                }
            }
        }
        return instance;
    }

    /*
    以上方法很好，但是由于jvm在创建对象时，可能存在指令重排现象。
    简单说: jvm初始化单例对象时正常步骤为 1.分配一块内存  2.初始化这个内存为null  3.将instance执行这块内存
    但是有时候为了提升效率，步骤可能变为1、3、2，即分配完内存，还没初始化时，就先将instance指向这个内存，此时这块内存由于还没初始化，可能存放着上一次使用的值，导致不为null
    为避免此现象，只需要将下面这个代码加个volatile关键字：
    private static SingleDemo2p instance;
    修改为 ===》
    private static volatile SingleDemo2p instance;
     */

}
