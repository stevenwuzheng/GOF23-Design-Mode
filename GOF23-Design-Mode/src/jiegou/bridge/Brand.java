package jiegou.bridge;

/*
*   桥接模式非常适合 2个维度各种又有自己的细分粒度，然后需要各种遍历组合 的场景
* */

public interface Brand {
    void showInfo();
}

class Lenovo implements Brand {
    @Override
    public void showInfo() {
        System.out.println("这是Lenovo品牌");
    }
}

class Dell implements Brand {
    @Override
    public void showInfo() {
        System.out.println("这是Dell品牌");
    }
}