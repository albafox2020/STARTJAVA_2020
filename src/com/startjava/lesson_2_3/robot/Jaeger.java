package com.startjava.lesson_2_3.robot;

public class Jaeger {

    String mark;
    int yearOfIssue;
    String status;
    String original;
    int height;
    double weight;
    int speed;
    int strength;;

    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void setOriginal(String original) {
        this.original = original;
    }
    public String getOriginal() {
        return original;
    }
    public void setHeight(int heightl) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }
    public boolean useChainSwords() {
        return true;
    }
    public boolean pourCoolant() {
        return true;
    }
    public Jaeger(String mark, int yearOfIssue, String status, String original, int height, double weight, int speed, int strength) {
        this.mark = mark;
        this.yearOfIssue = yearOfIssue;
        this.status = status;
        this.original = original;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
    }
}
