package jiegou.chainOfResp;

public class LeaveRequest {
    private String personName;
    private int days;
    private String reason;

    public LeaveRequest(String personName, int days, String reason) {
        this.personName = personName;
        this.days = days;
        this.reason = reason;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
