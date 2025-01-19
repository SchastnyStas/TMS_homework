package org.example.lesson_9;

import org.example.lesson_9.exceptions.EmptyWalletException;
import org.example.lesson_9.exceptions.GameOverException;
import org.example.lesson_9.exceptions.IllegalBetException;
import org.example.lesson_9.exceptions.IllegalBetNumberException;

import java.util.Random;

public class Game {

    int randomNumber = new Random().nextInt(5) + 1;

    public void validate(int bet, User user) throws IllegalBetException {
        if (bet > user.getWallet() || bet > 100 || bet <= 0) {
            throw new IllegalBetException();
        }
    }

    public boolean play(int number) throws GameOverException, IllegalBetNumberException {
        if (number == -1) {
            throw new GameOverException();
        }
        if (number < 1 || number > 5) {
            throw new IllegalBetNumberException();
        }

        if (number == randomNumber) {
            System.out.println("Вы угадали. Ваше число: " + number + " VS " + randomNumber);
            return true;
        } else {
            System.out.println("Вы не угадали. Ваше число: " + number + " VS " + randomNumber);
            return false;
        }
    }

    public void change(User user, int bet, boolean isWin) throws EmptyWalletException {
        if (isWin) {
            user.setWallet(user.getWallet() + bet);
            System.out.println("Текущий счет " + user.getWallet());
        } else {
            user.setWallet(user.getWallet() - bet);
            System.out.println("Текущий счет " + user.getWallet());
        }
        if (user.getWallet() == 0) {
            throw new EmptyWalletException();
        }
    }
}



