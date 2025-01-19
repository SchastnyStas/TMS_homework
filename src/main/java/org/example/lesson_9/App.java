package org.example.lesson_9;

import static org.example.lesson_9.GameUtil.doTheGame;
import static org.example.lesson_9.GameUtil.setUserParameters;

public class App {

    public static void main(String[] args) {
        User user = setUserParameters();
        doTheGame(user);
    }
}
