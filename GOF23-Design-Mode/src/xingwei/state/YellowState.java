package xingwei.state;

public class YellowState implements State {
    @Override
    public void handle() {
        System.out.println("黄灯亮了，等一等吧");
    }
}
