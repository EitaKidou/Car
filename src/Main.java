import model.Bank;
import model.User;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User(40000);
        Bank bank = new Bank(10000000);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите логин:");
            String b = scanner.nextLine();
            System.out.println("Введите пароль:");
            String c = scanner.nextLine();
            if (b.equals(user.getLogin()) && c.equals(user.getPassword())) {
                System.out.println("ВЫБЕРИТЕ МАРКУ МАШИНЫ, КОТОРУЮ ХОТЕЛИ БЫ ЗАБРОНИРОВАТЬ");
                while (true) {
                    System.out.println("""
                            1. ФЕРРАРИ
                            2. ХОНДА
                            3. МЕРС
                            4. ТОЙОТА
                            5. КИА
                            6. АУДИ
                            7. БМВ""");
                    int a = scanner.nextInt();
                    switch (a) {
                        case 1:
                            while(true) {
                                System.out.println("Ведите имя клиента:");
                                String name = scanner.next();
                                System.out.println("Введите адресс клиента:");
                                String address = scanner.next();
                                System.out.println("Введите номер телефона:");
                                String numberPhone = scanner.next();
                                if (name.equals(user.getLogin()) && address.equals(user.getAddress()) && numberPhone.equals(user.getNumberPhone())) {
                                    System.out.println("Внесите оплату 20000");
                                    user.pay(20000);
                                    bank.pay(20000);
                                    break;
                                } else
                                    System.out.println("Неверный логин, адресс или номер телефона. Пожалуйста, повторите попытку ещё раз:");
                            }

                        case 2:
                            System.out.println("Эта машина уже забронирована, выберите другую");
                            break;
                        case 3:
                            while(true) {
                                System.out.println("Ведите имя клиента:");
                                String name = scanner.next();
                                System.out.println("Введите адресс клиента:");
                                String address = scanner.next();
                                System.out.println("Введите номер телефона:");
                                String numberPhone = scanner.next();
                                if (name.equals(user.getLogin()) && address.equals(user.getAddress()) && numberPhone.equals(user.getNumberPhone())) {
                                    System.out.println("Внесите оплату 30000 ");
                                    user.pay(30000);
                                    bank.pay(30000);
                                    break;
                                } else
                                    System.out.println("Неверный логин, адресс или номер телефона. Пожалуйста, повторите попытку ещё раз:");
                            }

                        case 4:
                            System.out.println("Эта машина уже забронирована, выберите другую");
                            break;
                        case 5:
                            while(true) {
                                System.out.println("Ведите имя клиента:");
                                String name = scanner.next();
                                System.out.println("Введите адресс клиента:");
                                String address = scanner.next();
                                System.out.println("Введите номер телефона:");
                                String numberPhone = scanner.next();
                                if (name.equals(user.getLogin()) && address.equals(user.getAddress()) && numberPhone.equals(user.getNumberPhone())) {
                                    System.out.println("Внесите оплату 40000");
                                    user.pay(40000);
                                    bank.pay(40000);
                                    break;
                                } else
                                    System.out.println("Неверный логин, адресс или номер телефона. Пожалуйста, повторите попытку ещё раз:");

                            }

                        case 6:
                            System.out.println("Эта машина уже забронирована, выберите другую");
                            break;
                        case 7:
                            while(true) {
                                System.out.println("Ведите имя клиента:");
                                String name = scanner.next();
                                System.out.println("Введите адресс клиента:");
                                String address = scanner.next();
                                System.out.println("Введите номер телефона:");
                                String numberPhone = scanner.next();
                                if (name.equals(user.getLogin()) && address.equals(user.getAddress()) && numberPhone.equals(user.getNumberPhone())) {
                                    System.out.println("Внесите оплату 50000");
                                    user.pay(50000);
                                    bank.pay(50000);
                                    break;
                                } else
                                    System.out.println("Неверный логин, адресс или номер телефона. Пожалуйста, повторите попытку ещё раз:");
                            }
                        case 8:
                            return;
                    }
                }
            } else
                System.out.println("Неверный лоин или пароль, повторите попытку:");
        }

    }
}