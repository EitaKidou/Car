package model;

import java.util.Scanner;

public class User {
    private int money;
    private final String login = "SIMS";
    private final String password= "123456";
    private final String address = "ASDFGFH40";
    private final String numberPhone= "+996123123123";

    public String getAddress() {
        return address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }


    public User(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void pay(int pay){
        int v= money-pay;
        if (v<0){
            System.out.println("На вашем счёте недостаточно средств");

            while (true) {
                System.out.println("ЕСЛИ ХОТИТЕ МОЖЕТЕ ПОПОЛНИТЬ БАЛАНС НЕ ВЫХОДЯ ИЗ СИСТЕМЫ, ВЫ ЖЕЛАЕТЕ?(ДА/НЕТ)");
                String b = new Scanner(System.in).next();
                if (b.equals("ДА")) {
                    System.out.println("Введите логин");
                    String c = new Scanner(System.in).next();
                    System.out.println("Введите пароль");
                    String d = new Scanner(System.in).next();
                    if (c.equals(login) && d.equals(password)) {
                        System.out.println("Введите сумму:");
                        int o = new Scanner(System.in).nextInt();
                        int i = money + o;
                        int x = i-pay;
                        System.out.println("Успешно! На вашем счёте осталось:"+x);
                    } else
                        System.out.println("Неверный лоин или пароль, повторите попытку:");
                } else
                    return;
            }
        }
        else {
            int f = money- pay;
            System.out.println("Успешно! На вашем счёте осталось:"+f);
        }

        return;
    }



    @Override
    public String toString() {
        return "User{" +
                "money=" + money +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
