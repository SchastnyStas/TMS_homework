package org.example.lesson_6.exercise_2;

public class CreateMethod {
    public static void setString(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        CreateMethod.setString("Hello!", 5);
    }
}
