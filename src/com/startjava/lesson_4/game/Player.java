package com.startjava.lesson_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int number;
    private int count = 0;

    private int[] arrPl = new int[10];

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Player(String name) {
        this.name = name;
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

    public void setArrPl(int number, int count) {
        arrPl[count] = number;
    }

    public int[] getArrPl() {
        return arrPl;
    }

    public void fill() {
        if (count < 9) {
            Arrays.fill(arrPl, 0, count + 1, 0);
        } else {
            Arrays.fill(arrPl, 0);
        }
    }
}
