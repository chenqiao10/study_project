package cn.coolwind.redis.core.entity;

import java.io.Serializable;

public class TestDTO implements Serializable {

    private static final long serialVersionUID = -5201041164002794021L;

    private int id;

    private String name1;

    private String name2;

    private String value1;

    private String value2;

    @Override
    public String toString() {
        return "TestDTO{" +
                "id=" + id +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                '}';
    }

    public TestDTO(int id, String name1, String name2, String value1, String value2) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
        this.value1 = value1;
        this.value2 = value2;
    }

    public TestDTO() {
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
}
