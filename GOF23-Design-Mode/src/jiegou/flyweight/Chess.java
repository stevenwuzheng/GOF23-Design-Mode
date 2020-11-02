package jiegou.flyweight;

//享元类 FlyWeight(享元)
public interface Chess {
    String getColor();
    void display(Coordinate coordinate);
}


class ConcreteChess implements Chess {

    //为内部状态提供成员变量进行存储(不经常变化的，如color) 经常变化的外部状态是坐标，不能被共享
    String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色 = " + this.color);
        System.out.println("x = " + coordinate.getX() + "y  = " + coordinate.getY());
    }

}