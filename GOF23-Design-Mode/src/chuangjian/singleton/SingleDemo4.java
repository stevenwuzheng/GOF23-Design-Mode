package chuangjian.singleton;

/*利用枚举作为单例*/
public enum SingleDemo4 {

    //单例入口，java枚举元素要大写
    SHARED;

    //枚举底层就是单例类，本质和类一样
    public void sayHi(){
        System.out.println("sayHi: " + SHARED);
    }

}
