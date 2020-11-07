package xingwei.memento;

public class EmpMemento {
    private String name;
    private int salary;


    public Emp recover() {
        Emp emp = new Emp();
        emp.setName(this.name);
        emp.setSalary(this.salary);
        return emp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
