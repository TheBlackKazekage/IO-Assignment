package com.company.oop;

public class Worker extends Person{
    private String empNo;
    private Department department;
    private String designation;
    private int salary;

    public Worker(){}

    public Worker(String eNo, Department eDept, String eDes, int sal){
        this.empNo = eNo;
        this.department = eDept;
        this.designation = eDes;
        this.salary = sal;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String displayWorkerObituary() {
        return "Worker info for obituary: " + empNo + ", " + department + ", " + designation + ", "  + salary;
    }
}

