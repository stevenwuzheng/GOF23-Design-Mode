package xingwei.chainOfResp;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleLeaveRequest(LeaveRequest request) {
        if (request.getDays() < 3) {
            System.out.println("员工：" + request.getPersonName() + "请假(天)：" + request.getDays());
            System.out.println("主任: " + this.name + "审批通过！");
        } else {
            this.nextLeader.handleLeaveRequest(request);
        }
    }


}
