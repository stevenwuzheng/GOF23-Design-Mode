package xingwei.state;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
        System.out.println("------------- 状态切换了 -----------");
        state.handle();
    }


}
