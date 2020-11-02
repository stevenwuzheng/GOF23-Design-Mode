package jiegou.chainOfResp;

//java异常处理机制try/catch就是责任链; spring过滤器机制;
public class Client {
    public static void main(String[] args) {

        Director director = new Director("刘主任");
        Manager manager = new Manager("吴经理");
        GeneralManager generalManager = new GeneralManager("李总经理");
        //设置责任链关系
        director.nextLeader = manager;
        manager.nextLeader = generalManager;

        LeaveRequest leaveRequest = new LeaveRequest("Tom", 9, "肚子疼");
        director.handleLeaveRequest(leaveRequest);

    }
}
