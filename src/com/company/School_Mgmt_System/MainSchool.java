package com.company.School_Mgmt_System;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MainSchool {
    private static String userName;

    private static BufferedReader buffInput = null;
    private static FileWriter outputStaff = null;
    private static FileWriter outputStudent = null;
    private static FileInputStream readerStaff = null;
    private static FileInputStream readerStudent = null;

    private static ArrayList<Student> mainListStudent = null;
    private static ArrayList<Staff> mainListStaff = null;
    //private static ArrayList<Student> listStudent;

    public static void main(String[] args) throws IOException {

        try{
            mainListStudent = new ArrayList<>();
            mainListStaff = new ArrayList<>();
            readFileToArrayList();

            buffInput = new BufferedReader(new InputStreamReader(System.in));
            outputStaff = new FileWriter("Staff.txt");
            outputStudent = new FileWriter("Student.txt");

            System.out.print("What is your name? : ");
            userName = buffInput.readLine();

            welcome();
            mainPage((char) buffInput.read());

        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(buffInput != null){
                buffInput.close();
            }
            if(outputStaff != null){
                outputStaff.close();
            }
            if(outputStudent != null){
                outputStudent.close();
            }
        }
    }

    private static void welcome() throws IOException {
        System.out.println("Welcome " + userName + " to the Main Page. Select the numbers to perform an action: ");
        System.out.println("1. To Update Staff Data. \n2. To View Staff Data. \n\n3. To Update Student Data. \n4. To View Student Data. \n0. to exit...");
        mainPage((char) buffInput.read());
    }

    private static void mainPage(char c) throws IOException {
        switch (c){
            case '1':
                updateStaffData();
                break;
            case '2':
                viewStaffData();
                break;
            case '3':
                updateStudentData();
                break;
            case '4':
                viewStudentData();
                break;
            case '0':
                writeStafftoFile(mainListStaff);
                writeStudenttoFile(mainListStudent);
                break;

        }
    }

    private static void updateStudentData() throws IOException {
        System.out.println("\n1. To create new student member. \n2. To update student details. \n0. to return home...");
        BufferedReader buff = null;

        try{
            buff = new BufferedReader(new InputStreamReader(System.in));
            String s = buff.readLine();
            int c = Integer.parseInt(s);
            switch (c) {
                case 1:
                    Student newStudent;
                    System.out.print("\nEnter student ID (DEPT CODE + NO): ");
                    String id = buff.readLine();
                    System.out.print("Enter student course: ");
                    String course = buff.readLine();
                    System.out.print("Enter student level: ");
                    String level = buff.readLine();
                    System.out.print("Enter student points (number): ");
                    String point = buff.readLine();

                    System.out.print("Enter student name: ");
                    String name = buff.readLine();
                    System.out.print("Enter student phone no: ");
                    String phone = buff.readLine();

                    newStudent = new Student(id, course, level, point);

                    newStudent.setName(name);
                    newStudent.setPhoneNo(phone);

                    //ArrayList<Staff> listStaff = new ArrayList<>();
                    mainListStudent.add(newStudent);

//                    String str = listStaff.toString();
//                    String result = str.substring(1, str.length() - 2);
//                    outputStaff.write(result);
//                    outputStaff.write("\n");
//                    outputStaff.flush();

                    //writeStafftoFile(mainListStaff);

                    System.out.println("New Student User Created...");
                    System.out.println();

                    welcome();
                    mainPage((char) buffInput.read());
                    break;

                case 2:
                    Iterator iterator = mainListStudent.iterator();
                    while(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }

                    //enter the id, choose what to edit, update arrayList
                    //pass the id to get the arrayList index
                    //get the student attribute to edit
                    //use setters to edit the attribute
                    //return the object to its position
                    System.out.print("Enter the position to edit: ");
                    String studentID = buff.readLine();
                    int position = Integer.parseInt(studentID);

                    Student student = mainListStudent.get(position);

                    System.out.println("What attribute do you want to edit? \n1. Student ID No. \n2. Course \n3. Level \n4. Points \n.8 return to main menu...");
                    String choice = buff.readLine();
                    int edit = Integer.parseInt(choice);

                    switch (edit){
                        case 1:
                            System.out.print("Enter new Student ID No: ");
                            String newID = buff.readLine();

                            student.setStudentIdNo(newID);
                            mainListStudent.set(position, student);
                            System.out.println("Student ID No. updated...");

//                            while(iterator.hasNext()){
//                                System.out.println(iterator.next());
//                            }

//
//                            Iterator it = mainListStaff.iterator();
//                            while(it.hasNext()){
//                                System.out.println(it.next().toString());
//                            }

                            for (Student student1 : mainListStudent) {
                                System.out.println(student1.toString());
                            }

                            System.out.println();
                            //System.out.println(mainListStaff);
                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                        case 2:
                            System.out.print("Enter new Course: ");
                            String newCourse = buff.readLine();

                            student.setCourse(newCourse);
                            mainListStudent.set(position, student);
                            System.out.println("Student Role updated...");

                            for (Student student1 : mainListStudent) {
                                System.out.println(student1.toString());
                            }

                            System.out.println();

//                            writeStafftoFile(mainListStaff);

                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                        case 3:
                            System.out.print("Enter new Student level: ");
                            String newLevel = buff.readLine();

                            student.setLevel(newLevel);
                            mainListStudent.set(position, student);
                            System.out.println("Student Level updated...");

                            for (Student student1 : mainListStudent) {
                                System.out.println(student1.toString());
                            }

                            System.out.println();

//                            writeStafftoFile(mainListStaff);

                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                        case 4:
                            System.out.print("Enter new Points: ");
                            String newPoints = buff.readLine();

                            student.setPoints(newPoints);
                            mainListStudent.set(position, student);
                            System.out.println("Student Points updated...");

                            for (Student student1 : mainListStudent) {
                                System.out.println(student1.toString());
                            }

                            System.out.println();

//                            writeStafftoFile(mainListStaff);

                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                    }


                case 0:
//
                    break;
            }

        }catch (IOException e){
            e.getMessage();
        }finally {
            if (buff != null){
                buff.close();
            }
            if(buffInput != null){
                buffInput.close();
            }
        }
    }

    private static void updateStaffData() throws IOException{
        System.out.println("\n1. To create new staff member. \n2. To update staff details. \n0. to return home...");
        BufferedReader buff = null;

        try{
            buff = new BufferedReader(new InputStreamReader(System.in));
            String s = buff.readLine();
            int c = Integer.parseInt(s);
            switch (c) {
                case 1:
                    Staff newStaff;
                    System.out.print("\nEnter staff ID (DEPT CODE + NO): ");
                    String id = buff.readLine();
                    System.out.print("Enter staff role: ");
                    String role = buff.readLine();
                    System.out.print("Enter staff department: ");
                    String department = buff.readLine();
                    System.out.print("Enter staff salary (number): ");
                    String sal = buff.readLine();
                    int salary = Integer.parseInt(sal);

                    System.out.print("Enter staff name: ");
                    String name = buff.readLine();
                    System.out.print("Enter staff phone no: ");
                    String phone = buff.readLine();

                    newStaff = new Staff(id, role, department, salary);

                    newStaff.setName(name);
                    newStaff.setPhoneNo(phone);

                    //ArrayList<Staff> listStaff = new ArrayList<>();
                    mainListStaff.add(newStaff);

//                    String str = listStaff.toString();
//                    String result = str.substring(1, str.length() - 2);
//                    outputStaff.write(result);
//                    outputStaff.write("\n");
//                    outputStaff.flush();

                    //writeStafftoFile(mainListStaff);

                    System.out.println("New User Created...");
                    System.out.println();

                    welcome();
                    mainPage((char) buffInput.read());
                    break;

                case 2:
                    Iterator iterator = mainListStaff.iterator();
                    while(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }

                    //enter the id, choose what to edit, update arrayList
                    //pass the id to get the arrayList index
                    //get the student attribute to edit
                    //use setters to edit the attribute
                    //return the object to its position
                    System.out.print("Enter the position to edit: ");
                    String staffID = buff.readLine();
                    int position = Integer.parseInt(staffID);

                    Staff staff = mainListStaff.get(position);

                    System.out.println("What attribute do you want to edit? \n1. Staff ID No. \n2. Role \n3. Department \n4. Salary \n.8 return to main menu...");
                    String choice = buff.readLine();
                    int edit = Integer.parseInt(choice);

                    switch (edit){
                        case 1:
                            System.out.print("Enter new Staff ID No: ");
                            String newID = buff.readLine();

                            staff.setStaffIdNo(newID);
                            mainListStaff.set(position, staff);
                            System.out.println("Staff ID No. updated...");

//                            while(iterator.hasNext()){
//                                System.out.println(iterator.next());
//                            }

//
//                            Iterator it = mainListStaff.iterator();
//                            while(it.hasNext()){
//                                System.out.println(it.next().toString());
//                            }

                            for (Staff staff1 : mainListStaff) {
                                System.out.println(staff1.toString());
                            }

                            System.out.println();
                            //System.out.println(mainListStaff);
                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                        case 2:
                            System.out.print("Enter new Role: ");
                            String newCourse = buff.readLine();

                            staff.setRole(newCourse);
                            mainListStaff.set(position, staff);
                            System.out.println("Staff Role updated...");

                            for (Staff staff1 : mainListStaff) {
                                System.out.println(staff1.toString());
                            }

                            System.out.println();

//                            writeStafftoFile(mainListStaff);

                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                        case 3:
                            System.out.print("Enter new Staff Department: ");
                            String newLevel = buff.readLine();

                            staff.setDepartment(newLevel);
                            mainListStaff.set(position, staff);
                            System.out.println("Staff Department updated...");

                            for (Staff staff1 : mainListStaff) {
                                System.out.println(staff1.toString());
                            }

                            System.out.println();

//                            writeStafftoFile(mainListStaff);

                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                        case 4:
                            System.out.print("Enter new Salary: ");
                            String newPoints = buff.readLine();

                            staff.setSalary(Integer.parseInt(newPoints));
                            mainListStaff.set(position, staff);
                            System.out.println("Staff Salary updated...");

                            for (Staff staff1 : mainListStaff) {
                                System.out.println(staff1.toString());
                            }

                            System.out.println();

//                            writeStafftoFile(mainListStaff);

                            welcome();
                            mainPage((char) buffInput.read());
                            break;

                    }


                case 0:
//                    welcome();
//                    mainPage((char) buffInput.read());
//                    break;
            }

        }catch (IOException e){
            e.getMessage();
        }finally {
            if (buff != null){
                buff.close();
            }
            if(outputStaff != null){
                outputStaff.close();
            }
            if(buffInput != null){
                buffInput.close();
            }
        }
    }

    private static void viewStaffData() throws IOException {
        try{
//            readerStaff = new FileInputStream("Staff.txt");
//
//            int c;
//            while((c = readerStaff.read()) != -1){
//                System.out.print((char)c);
//            }

            for (Staff s : mainListStaff) {
                System.out.println(s);
            }

            System.out.println();

            welcome();
            mainPage((char) buffInput.read());

        }catch (Exception e){
            System.out.println(e);
        }finally {
            if(readerStaff != null){
                readerStaff.close();
            }
        }
    }

    private static void viewStudentData() throws IOException {
        try{
//            readerStudent = new FileInputStream("Student.txt");
//
//            int c;
//            while((c = readerStudent.read()) != -1){
//                System.out.print((char)c);
//            }

            for (Student s: mainListStudent) {
                System.out.println(s);
            }

            System.out.println();

//            Iterator iterator = mainListStudent.iterator();
//            while (iterator.hasNext()){
//                System.out.println("arrayList");
//                System.out.println(iterator.next());
//            }

//            System.out.println();
//            System.out.println("array");
//            System.out.println(Arrays.toString(mainListStudent.toArray()));
//
//            System.out.println();

//            for(Student str: mainListStudent){
//                System.out.println(str);
//            }

            welcome();
            mainPage((char) buffInput.read());

        }catch (Exception e){
            System.out.println(e);
        }finally {
            if(readerStudent != null){
                readerStudent.close();
            }
        }
    }

    private static void readFileToArrayList() throws IOException{
        BufferedReader readerStudent = null;
        BufferedReader readerStaff = null;

        try{
            readerStudent = new BufferedReader(new FileReader("Student.txt"));
            readerStaff = new BufferedReader(new FileReader("Staff.txt"));

            String lineStudent;
            while((lineStudent = readerStudent.readLine()) != null){
                Student s = new Student();
                String[] sections = lineStudent.trim().split("-");
                //s.setName(sections[0]);
                for(int i =0; i < sections.length; i++){
                    if(i == 0 && sections[i] != null){
                        s.setStudentIdNo(sections[i]);
                    }
                    if(i == 1 && sections[i] != null){
                        s.setCourse(sections[1]);
                    }
                    if(i == 2 && sections[i] != null){
                        s.setLevel(sections[2]);
                    }
                    if(i == 3 && sections[i] != null){
                        s.setPoints(sections[3]);
                    }
                }

                mainListStudent.add(s);
            }

            String lineStaff;
            while((lineStaff = readerStaff.readLine()) != null){
                Staff s = new Staff();
                String[] sections = lineStaff.trim().split("-");
                //s.setName(sections[0]);
                for(int i =0; i < sections.length; i++){
                    if(i == 0 && sections[i] != null){
                        s.setStaffIdNo(sections[0]);
                    }
                    if(i == 1 && sections[i] != null){
                        s.setRole(sections[1]);
                    }
                    if(i == 2 && sections[i] != null){
                        s.setDepartment(sections[2]);
                    }
                    if(i == 3 && sections[i] != null){
                        s.setSalary(Integer.parseInt(sections[3]));
                    }
                }


                mainListStaff.add(s);
            }


        }catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if (readerStudent != null){
                readerStudent.close();
            }
            if(readerStaff != null){
                readerStaff.close();
            }
        }
    }

    private static void writeStafftoFile(ArrayList<Staff> listStaff) throws IOException {
        for (Staff s : listStaff) {
            outputStaff.write(s.toString());
            outputStaff.write("\n");
        }


//        String str = listStaff.toString();
//        String result = str.substring(1, str.length() - 1);
//        result += System.lineSeparator();
//        outputStaff.write(result);
//        outputStaff.write("\n");


        //outputStaff.flush();
        outputStaff.close();
    }

    private static void writeStudenttoFile(ArrayList<Student> listStudent) throws IOException{
        for(Student s: listStudent){
            outputStudent.write(s.toString());
            outputStudent.write("\n");
        }


// String str = listStudent.toString();
//        String result = str.substring(1, str.length() - 2);
//        outputStudent.write(result);
////        outputStudent.write("\n");
//        System.lineSeparator();

        //outputStudent.flush();
        outputStudent.close();
    }
}
