package org.example.lesson_8.models;

public class AndroidPhone extends Phone {
    public AndroidPhone() {
        super("+375291236598", 7);
    }

    @Override
    public void firmware() {
        System.out.println("Model is Xiaomi Redmi 7");
    }
}
