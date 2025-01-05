package org.example.lesson_9.exceptions;

public class IllegalBetNumberException extends Exception {

    public static final String MESSAGE = "Номер должел быть в промежутке от 1 до 5";

    public IllegalBetNumberException() {
        super(MESSAGE);
    }
}
