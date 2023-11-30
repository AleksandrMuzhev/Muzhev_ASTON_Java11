package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");

        try {
            String name = scanner.nextLine();

            if (!isValidName(name)) {
                throw new IllegalArgumentException("Некорректное имя");
            }

            if ("Вячеслав".equals(name)) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода. " + e.getMessage());
        }
    }

    private static boolean isValidName(String name) {
        if (name == null) {
            return false;
        }

        if (name.trim().isEmpty()) {
            return false;
        }

        if (!name.matches("[a-zA-Zа-яА-Я]+")) {
            return false;
        }

        if (name.matches(".*\\d+.*")) {
            return false;
        }

        return true;
    }
}
