package org.example.lesson_5;

public class Student {
    private String name;
    private String surName;
    private int age;
    private int lectureCount;

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.lectureCount = 9;
    }

    public Student(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.lectureCount = 11;
    }

    public Student(String name, String surName, int age, int lectureCount) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.lectureCount = lectureCount;
    }

    public void setLectureCount(int lectureCount) {
        this.lectureCount = lectureCount;
    }

    public String getFullName() {
        return name + " " + surName;
    }

    public void printInfo() {
        System.out.println(surName + " посещает " + lectureCount + " занятий.");
    }
}
