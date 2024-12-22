package org.example.lesson_8.models;

public class WindowsPhone extends Phone {

    public WindowsPhone() {
        super("+5796853214", 15);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling to special windows phone number: " + phoneNumber);
    }

    @Override
    public void firmware() {
        System.out.println("Model is Nokia 3310");
    }
}
