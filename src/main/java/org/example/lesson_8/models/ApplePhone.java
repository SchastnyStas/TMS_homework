package org.example.lesson_8.models;

public class ApplePhone extends Phone {
    public ApplePhone() {
        super("+487778899", 9);
    }

    @Override
    public void firmware() {
        System.out.println("Model is Apple iPhone 11");
    }
}
