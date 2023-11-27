package model;

import java.util.Scanner;

public class Bank {
    private int money;

    public Bank(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void pay(int pay){
        int i =money + pay;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "money=" + money +
                '}';
    }
}
