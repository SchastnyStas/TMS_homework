package org.example.lesson_5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Eric", "Cartman");
        Student student2 = new Student("Stan", "Marsh", 10);
        Student student3 = new Student("Kyle", "Broflovski", 10, 7);
        String fullNameStudent1 = student1.getFullName();
        System.out.println(fullNameStudent1);
        String fullNameStudent2 = student2.getFullName();
        System.out.println(fullNameStudent2);
        String fullNameStudent3 = student3.getFullName();
        System.out.println(fullNameStudent3);
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student3.setLectureCount(10);
        student3.printInfo();
    }
}
