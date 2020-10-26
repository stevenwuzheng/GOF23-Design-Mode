package chuangjian.prototype;

import java.io.Serializable;
import java.util.Date;

public class Cow  implements Serializable {
    private String name;
    private Date birthday;

    public Cow(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Cow{" + System.identityHashCode(this) +
                " name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
