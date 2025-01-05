package org.example.lesson_9.exceptions;

public class IllegalBetException extends Exception {

    public static final String MESSAGE = "Ставка не соответсвует вашим возможностям или некорректна. Попробуйте заново.";

    public IllegalBetException() {
        super(MESSAGE);
    }
}
