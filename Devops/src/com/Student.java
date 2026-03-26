package com;

public class Student {
    String name;
    int m1, m2, m3;

    Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int getTotal() {
        return m1 + m2 + m3;
    }

    double getAverage() {
        return getTotal() / 3.0;
    }

    String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }

    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + getTotal());
        System.out.println("Average: " + getAverage());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {

        String name = "Durga";
        int m1 = 85;
        int m2 = 90;
        int m3 = 80;

        Student s = new Student(name, m1, m2, m3);
        s.display();
    }
}