package xingwei.state;

public class GreenState implements State {
    @Override
    public void handle() {
        System.out.println("绿灯亮了，可以开车走了");
    }
}
