package org.example;

public class Task3 {
    public static void main(String[] args) {
        double[] array = {3, 6, 9, 12, 15, 17};

        try {
            for (double num : array) {
                if (num % 3 == 0) {
                    System.out.println(num);
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка обработки, значения не кратны 3");
        }
    }
}
