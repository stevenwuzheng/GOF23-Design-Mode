package xingwei.memento;

public class Emp {
    private String name;
    private int salary;

    public EmpMemento memento() {
        EmpMemento memento = new EmpMemento();
        memento.setName(this.name);
        memento.setSalary(this.salary);
        return memento;
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


    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
