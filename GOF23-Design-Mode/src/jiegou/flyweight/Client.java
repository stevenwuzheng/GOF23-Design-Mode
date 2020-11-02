package jiegou.flyweight;


//享元模式由于其共享特性，经常用在池的开发中，如线程池、数据库连接池
public class Client {

    public static void main(String[] args) {
        Chess chess = ChessFactory.getChess("黑色");
        Chess chess1 = ChessFactory.getChess("黑色");
        System.out.println("chess = " + chess);
        System.out.println("chess1 = " + chess);

        Chess chess2 = ChessFactory.getChess("白色");
        System.out.println("chess2 = " + chess2);

        System.out.println("-----修改外部状态");
        chess1.display(new Coordinate(10,20));
        chess2.display(new Coordinate(30,50));

    }

}
