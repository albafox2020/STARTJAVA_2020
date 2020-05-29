package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] enteredNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return enteredNums[attempt -1];
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setNumber(int guessNumber) {
        enteredNums[attempt -1] = guessNumber;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempt);
    }

    public void fillEnteredNums() {
        Arrays.fill(enteredNums, 0, attempt, 0);
        attempt = 0;
    }
}