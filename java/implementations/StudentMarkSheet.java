package com.jmrchelani;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentMarkSheet {
    public static void main(String[] args) {
        LinkedHashMap<String, Student> marksheet = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);
        String tmp = "";
        while(!tmp.equalsIgnoreCase("exit")) {
            if(tmp.equalsIgnoreCase("add")) {
                String roll;
                int marks;
                System.out.println("Enter the roll number of student: ");
                roll = scan.nextLine();
                System.out.println("Enter marks obtained: ");
                marks = scan.nextInt();
                marksheet.put(roll, new Student(roll, marks));
                System.out.println("Successfully added "+roll+" in the table");
                tmp = "";
            } else if (tmp.equalsIgnoreCase("remove")) {
                String roll;
                System.out.println("Enter the roll number to remove: ");
                roll = scan.nextLine();
                if(marksheet.containsKey(roll)) {
                    marksheet.remove(roll);
                    System.out.println("Successfully removed "+roll+" from table");
                } else {
                    System.out.println("No such roll number exists in the table.");
                }
                tmp = "";
            } else if (tmp.equalsIgnoreCase("show")) {
                String roll;
                System.out.println("Enter the roll number to show: ");
                roll = scan.nextLine();
                if(marksheet.containsKey(roll)) {
                    System.out.println(marksheet.get(roll));
                } else {
                    System.out.println("No such roll number exists in the table.");
                }
                tmp = "";
            } else if (tmp.equalsIgnoreCase("list")) {
                System.out.println(marksheet);
                tmp = "";
            } else {
                System.out.println("Type \"add\" to add a student.");
                System.out.println("Type \"remove\" to remove a student.");
                System.out.println("Type \"show\" to show a student.");
                System.out.println("Type \"list\" to show all student.");
                System.out.println("Type \"exit\" to exit.");
                System.out.println("Type the command: ");
                tmp = scan.nextLine();
            }
        }
    }
}

class Student {
    String rollNo;
    int marks;
    Student() {
        rollNo = "NULL";
        marks = 0;
    }
    Student(String a, int b) {
        rollNo = a;
        marks = b;
    }
    public String toString() {
        return "[ " + rollNo + " : " + marks + " ]";
    }
}
