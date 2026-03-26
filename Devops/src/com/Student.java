package com;

import java.util.Scanner;

public class Student {
    String name;
    int m1, m2, m3;

    // Constructor
    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Method to calculate total
    int getTotal() {
        return m1 + m2 + m3;
    }

    // Method to calculate average
    double getAverage() {
        return getTotal() / 3.0;
    }

    // Method to get grade
    String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }

    // Display result
    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter 3 Subject Marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        Student s = new Student(name, m1, m2, m3);
        s.display();
    }
}