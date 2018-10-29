package com.company.oop;

public class Main{

    public static void main(String[] args){

        //
        Department dept = new Department();
        dept.setName("Interns");
        dept.setCode("INT");
        dept.setHod("Tabitha");

        Worker w = new Worker();

        //name = 123;

        //Worker q = new Worker("Systech Intern 12", dept, "Intern", 0);

        w.setEmpNo("Systech Intern 45");
        w.setDepartment(dept);
        w.setDesignation("Interns");

        System.out.println(dept);

//        System.out.println(w.displayWorkerObituary());
//        w.startSchool();

        Person p = new Worker();    //loses the attributes of a worker and becomes a person
        ((Worker) p).displayWorkerObituary();
        //((Worker) p).setDepartment("Trainer");
        ((Worker) p).setEmpNo("Trainer 01");
        p.setName("Brian"); //calls the super constructor

        System.out.println(w.getDepartment());


        //Worker k = (Worker) new Person();   //not a perfect inheritance... needs common

        System.out.println();
        //System.out.println(q.displayWorkerObituary());
        System.out.println(w.displayWorkerObituary());
        System.out.println(((Worker) p).displayWorkerObituary());
    }
}
