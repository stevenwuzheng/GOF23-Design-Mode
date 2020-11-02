package xingwei.state;

//状态模式: context只负责切换状态，状态类自己封装了不同的操作
public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        context.setState(new GreenState());
        context.setState(new RedState());
        context.setState(new YellowState());

    }
}
