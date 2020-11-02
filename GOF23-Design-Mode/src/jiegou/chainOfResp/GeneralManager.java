package jiegou.chainOfResp;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleLeaveRequest(LeaveRequest request) {
        if (request.getDays() >= 10) {
            System.out.println("员工：" + request.getPersonName() + "请假(天)：" + request.getDays());
            System.out.println("总经理审批: " + this.name + "审批通过！");
        } else {
            System.out.println("请假不超过10天，不需要总经理批准");
        }
    }


}
