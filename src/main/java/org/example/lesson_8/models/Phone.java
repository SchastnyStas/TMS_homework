package org.example.lesson_8.models;

public abstract class Phone {
    private String testNumber;
    private int maxLoudness;

    public Phone(String testNumber, int maxLoudness) {
        this.testNumber = testNumber;
        this.maxLoudness = maxLoudness;
    }

    public int getMaxLoudness() {
        return maxLoudness;
    }

    public String getTestNumber() {
        return testNumber;
    }

    public void call(String phoneNumber) {
        System.out.println("Calling to: " + phoneNumber);
    }

    public void play(int loudness) {
        System.out.println("Play the music with " + loudness + " loudness");
    }

    public abstract void firmware();
}
