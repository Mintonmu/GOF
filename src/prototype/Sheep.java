package prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @author:muming
 * @date:2018/12/1 13:39
 * @description:原型模式
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date birthday;

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
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
    protected Object clone() throws CloneNotSupportedException {

        //潜clone return super.clone();
        //deepclone
        Object object = super.clone();
        Sheep s = (Sheep) object;
        s.birthday = (Date) this.birthday.clone();
        return object;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
