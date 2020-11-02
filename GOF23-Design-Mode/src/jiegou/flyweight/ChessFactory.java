package jiegou.flyweight;

import java.util.HashMap;
import java.util.Map;

//享元工厂类
public class ChessFactory {
    //享元池(池子都是容器)
    private static Map<String , Chess>  map = new HashMap<String, Chess>();

    public static Chess getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ConcreteChess chess = new ConcreteChess(color);
            map.put(color,chess);
            return chess;
        }
    }

}
