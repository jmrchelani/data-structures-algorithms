package com.jmrchelani;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {
        LinkedHashMap<String, StudentModel> students = new LinkedHashMap<>();
        String tmp = "";
        Scanner scan = new Scanner(System.in);
        while(!tmp.equalsIgnoreCase("exit")) {
            if(tmp.equalsIgnoreCase("add")) {
                String roll;
                double att;
                System.out.println("Enter the roll number of student: ");
                roll = scan.nextLine();
                System.out.println("Enter attendance: ");
                att = scan.nextDouble();
                students.put(roll, new StudentModel(roll, att));
                System.out.println("Added into the list.");
                tmp = "";
                continue;
            } else if(tmp.equalsIgnoreCase("remove")) {
                String roll;
                System.out.println("Enter the roll number of student to remove: ");
                roll = scan.nextLine();
                if(!students.containsKey(roll)) System.out.println("Student does not exist in the database.");
                else {
                    students.remove(roll);
                    System.out.println("Removed successfully.");
                }
                tmp = "";
                continue;
            } else if(tmp.equalsIgnoreCase("show")) {
                String roll;
                System.out.println("Enter the roll number: ");
                roll = scan.nextLine();
                if(!students.containsKey(roll)) System.out.println("Student does not exist in the database.");
                else System.out.println(students.get(roll));
                tmp = "";
                continue;
            } else if(tmp.equalsIgnoreCase("list")) {
                System.out.println(students);
            } else {
                System.out.println("\"add\" to add a student.");
                System.out.println("\"remove\" to remove a student.");
                System.out.println("\"show\" to show a student.");
                System.out.println("\"list\" to show all student.");
                System.out.println("\"exit\" to exit..");
            }
            System.out.println("Enter the command: ");
            tmp = scan.nextLine();
        }
    }
}


class StudentModel {
    String rollNo;
    double attendance;
    StudentModel() {
        rollNo = "";
        attendance = 0;
    }
    StudentModel(String s, double d) {
        rollNo = s;
        attendance = d;
    }

    @Override
    public String toString() {
        return "Student {" +
                "rollNo='" + rollNo + '\'' +
                ", attendance=" + attendance +
                '}';
    }
}
