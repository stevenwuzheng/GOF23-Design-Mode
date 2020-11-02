package jiegou.chainOfResp;

public abstract class Leader {

    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    ///抽象方法，责任链的核心方法
    public abstract void handleLeaveRequest(LeaveRequest request);


}
