package xingwei.memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {
    private List<EmpMemento> list = new ArrayList<>();

    public void addMemento(EmpMemento empMemento) {
        list.add(empMemento);
    }

    public EmpMemento popMemento() {
        EmpMemento memento = null;
        if (list.size() > 0) {
            memento = list.get(list.size()-1);
            list.remove(memento);
        }
        return memento;
    }

}
