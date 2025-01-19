package org.example.lesson_9;

import org.example.lesson_9.exceptions.EmptyWalletException;
import org.example.lesson_9.exceptions.GameOverException;
import org.example.lesson_9.exceptions.IllegalBetException;
import org.example.lesson_9.exceptions.IllegalBetNumberException;

import java.util.Scanner;

public class GameUtil {
    static Scanner scanner = new Scanner(System.in);

    public static User setUserParameters() {

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите сумму на счете: ");
        int wallet = scanner.nextInt();
        return new User(name, wallet);
    }

    public static void doTheGame(User user) {
        while (user.getWallet() > 0) {

            System.out.println("Ставка");
            int moneyBet = scanner.nextInt();
            Game game = new Game();
            boolean isWin = false;
            try {
                game.validate(moneyBet, user);
            } catch (IllegalBetException e) {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println("Выберите число от 1 до 5, '-1' если хотите выйти из игры");
            int numberBet = scanner.nextInt();
            try {
                isWin = game.play(numberBet);
            } catch (GameOverException e) {
                System.out.println(e.getMessage());
                break;
            } catch (IllegalBetNumberException e) {
                System.out.println(e.getMessage());
                continue;
            }
            try {
                game.change(user, moneyBet, isWin);
            } catch (EmptyWalletException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
