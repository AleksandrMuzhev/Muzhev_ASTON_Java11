package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        try {
            double number = scanner.nextDouble();

            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Число не больше 7");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Введите корректное число.");
        }
    }
}