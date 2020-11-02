package xingwei.state;

public class RedState implements State {
    @Override
    public void handle() {
        System.out.println("红灯亮了，赶紧停车等待");
    }
}
