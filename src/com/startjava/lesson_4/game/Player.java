package com.startjava.lesson_4.game;

import java.util.Arrays;

class Player<number> {
    private String name;
    private int number;
    private int attempt = 0;
    private int[] enteredNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        enteredNums[attempt] = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getEnteredNums(int attempt) {
        return enteredNums[attempt];
    }

    public int[] getEnteredNums() {
        return enteredNums;
    }

    public void setEnteredNums(int number, int attempt) {
        enteredNums[attempt] = number;
    }
}
