package xingwei.memento;

public class Client {

    public static void main(String[] args) {


        Emp emp = new Emp();
        emp.setName("wz");
        emp.setSalary(10000);
        System.out.println("第1次打印 emp = " + emp);

        //备份下
        EmpMemento memento = emp.memento();
        MementoManager manager = new MementoManager();
        manager.addMemento(memento);

        emp.setSalary(20000);
        System.out.println("第2次打印 emp = " + emp);

        System.out.println("-----------恢复数据------------");
        EmpMemento memento1 = manager.popMemento();
        Emp emp1 = memento1.recover();
        System.out.println("第3次打印 emp1 = " + emp1);

    }

}
