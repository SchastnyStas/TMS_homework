package org.example.lesson_9.exceptions;

public class EmptyWalletException extends Exception {
    public static final String MESSAGE = "Кошелек пустой. Game over";

    public EmptyWalletException() {
        super(MESSAGE);
    }
}
