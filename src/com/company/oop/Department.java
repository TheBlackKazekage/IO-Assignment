package com.company.oop;

public class Department {
    private String name;
    private String code;
    private String hod;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    @Override
    public String toString() {
        return "Department{ " +
                "name= '" + name + '\'' +
                ", code= '" + code + '\'' +
                ", hod= '" + hod + '\'' +
                '}';
    }
}
