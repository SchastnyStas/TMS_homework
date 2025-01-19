package org.example.lesson_9.exceptions;

public class GameOverException extends Exception {

    public static final String MESSAGE = "Вы вышли из игры";

    public GameOverException() {
        super(MESSAGE);
    }
}
