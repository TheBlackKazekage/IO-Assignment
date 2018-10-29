package com.company.oop;

public class Person {
    private String name;
    private String idNo;
    private String phoneNo;
    private String email;


    //name getter
    public String getName() {
        return name;
    }

    //name setter
    public void setName(String nameWorker) {
        name = nameWorker;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    //phoneNo getter
    public String getPhoneNo() {
        return phoneNo;
    }

    //phoneNo setter
    public void setPhoneNo(String phoneNoWorker) {
        phoneNo = phoneNoWorker;
    }

    //email getter
    public String getEmail() {
        return email;
    }

    //email setter
    public void setEmail(String emailWorker) {
        email = emailWorker;
    }

    public void startSchool(){
        System.out.println("School started at age 3");
    }
}

