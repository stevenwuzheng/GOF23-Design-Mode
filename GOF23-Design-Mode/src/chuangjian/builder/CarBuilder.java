package chuangjian.builder;

//构建者 StringBuilder、DomBuilder、SaxBuilder都用到构建者模式
public interface CarBuilder {
    Engine buildEngine();
    Tire buildTire();
}
