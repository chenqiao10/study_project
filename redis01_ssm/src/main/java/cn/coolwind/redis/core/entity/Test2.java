package cn.coolwind.redis.core.entity;

import java.io.Serializable;

public class Test2 implements Serializable {

    private static final long serialVersionUID = -2927660118215426301L;

    @Override
    public String toString() {
        return "Test2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    private int id;

    private String name;

    private String value;

    public Test2(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Test2() {
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
