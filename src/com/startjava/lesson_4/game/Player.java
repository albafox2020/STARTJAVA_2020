package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int attempt;
    private int[] enteredNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player(int number) {
        this.number = number;
    }

    public int getNumber() {
        return enteredNums[attempt];
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void intNumber(int guessNumber) {
        enteredNums[attempt] = guessNumber;
    }

    public int[] showEnteredNums() {
        return Arrays.copyOf(enteredNums, (attempt + 1));
    }

    public void fillEnteredNums() {
        Arrays.fill(enteredNums, 0, (attempt + 1), 0);
        attempt = 0;
    }
}