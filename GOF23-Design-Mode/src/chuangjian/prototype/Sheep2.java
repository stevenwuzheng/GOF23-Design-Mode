package chuangjian.prototype;

import java.util.Date;

public class Sheep2 implements Cloneable {
    private String name;
    private Date birthday;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep2 obj = (Sheep2) super.clone();
        //深复制
        obj.setBirthday((Date) this.birthday.clone());
        return obj;
    }

    public Sheep2(String name, Date birthday) {
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
        return "Sheep{" + System.identityHashCode(this) +
                " name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
