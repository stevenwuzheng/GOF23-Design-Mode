package xingwei.chainOfResp;

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleLeaveRequest(LeaveRequest request) {
        if (request.getDays() >= 3 && request.getDays() <10) {
            System.out.println("员工：" + request.getPersonName() + "请假(天)：" + request.getDays());
            System.out.println("经理: " + this.name + "审批通过！");
        } else {
            this.nextLeader.handleLeaveRequest(request);
        }
    }


}
