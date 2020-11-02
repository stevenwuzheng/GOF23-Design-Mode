package xingwei.template;

public abstract class GovermentTemplate {

    private void takeNumber() {
        System.out.println("来办事，先取号");
    }

    ///办具体的业务：交由子类去实现  (抽象方法，也叫钩子方法)
    protected abstract void handleBusiness();

    private void feedback() {
        System.out.println("办完业务，给个好评");
    }

    ///预先设定好流程
    public void process() {
        takeNumber();
        handleBusiness();
        feedback();
    }

}
