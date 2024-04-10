package ru.stormsar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            System.out.println("Введите возраст пользователя:");
            int age = Integer.parseInt(scanner.nextLine());

            User user = new User(name, age);
            users.add(user);
        }

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getAge().compareTo(u2.getAge());
            }
        });

        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}