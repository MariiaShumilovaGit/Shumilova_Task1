package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите номер задания oт 1 до 6 ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        switch (a) {
            case "1":
                Task1();
                break;
            case "2":
                Task2(args);
                break;
            case "3":
                Task3();
                break;
            case "4":
                Task4();
                break;
            case "5":
                Task5(args);
                break;
            case "6":
                Task6();
                break;
            default:
                System.out.println("Ваше число не валидное");
        }
    }

    public static void Task1() {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Добро пожаловать, " + name);
        scanner.close();
    }

    public static void Task2(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }

    public static void Task3() {
        System.out.println("Введите количество цифр, которые будут показаны на экране: ");
        Scanner scanner = new Scanner(System.in);
        int kolichestvo = scanner.nextInt();
        for (int n = 0; n < kolichestvo; n++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.print(randomNumber + " ");
        }
        System.out.println();
        for (int n = 0; n < kolichestvo; n++) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);

        }
    }

    public static void Task4() {
        System.out.println("Введите пароль: ");
        Scanner scanner = new Scanner(System.in);
        String inputPass = scanner.next();
        String password = "123";
        if (password.equals(inputPass)) {
            System.out.println("Пароль верный");
        } else
            System.out.println("Пароль неверный");
    }

    public static void Task5(String[] args) {
        int sum = 0;
        int mult = 1;
        for (int i = args.length - 1; i >= 0; i--) {
            sum += Integer.parseInt(args[i]);
            mult *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + mult);
    }

    public static void Task6() {
        System.out.println("Введите 4 целых числа: ");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        int[] array = new int[]{
                number1, number2, number3, number4
        };
        //получение четных и нечетных чисел
        System.out.println("Четные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Нечетные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        //нахождение найбольшего и найменьшего числа
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.println("Найбольшее число: " + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        System.out.println("Найменьшее число: " + min);

        System.out.println("Числа, которые делятся на 3 или на 9: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 || array[i] % 9 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Числа, которые делятся на 5 и на 7: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Трехзначные числа с неповторяющимися цифрами: ");
        for (int i = 0; i < array.length; i++) {
            String chislo = String.valueOf(array[i]);
            if (chislo.length() == 3) {
                String[] arrayOfStrings = chislo.split("");
                if (arrayOfStrings[0].equals(arrayOfStrings[1]) || arrayOfStrings[1].equals(arrayOfStrings[2]) || arrayOfStrings[0].equals(arrayOfStrings[2])) {
                } else System.out.println(chislo);
            }
        }

        System.out.println("Счастливые числа: ");
        for (int i = 0; i < array.length; i++) {
            String chislo = String.valueOf(array[i]);
            if (chislo.length() == 4) {
                String[] arrayOfStrings = chislo.split("");
                if (Integer.parseInt(arrayOfStrings[0]) + Integer.parseInt(arrayOfStrings[1]) == Integer.parseInt(arrayOfStrings[2]) + Integer.parseInt(arrayOfStrings[3])) {
                    System.out.println(chislo);
                }
            }
        }
    }
}