package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.printf("Площадь круга с радиусом %.2f равна %.2f\n", radius, area);
    }
}

class Conversion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите сумму в долларах: ");
        double dollar = console.nextDouble();
        double rate = 0.85;

        double convertedEuro = dollar * rate;
        System.out.println("Сумма в евро: " + convertedEuro);
    }
}

class Maximum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Введите 10 целых чисел: ");

        for (int i = 0; i < numbers.length; i++) {
             int chisla = console.nextInt();
             numbers[i] = chisla * chisla;
        }

        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Максимальное число: " + max);
    }
}

class ComingAge {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите свой возраст: ");
        int age = console.nextInt();

        if (age < 18) {
            System.out.println("Вы не совершеннолетний!");
        } else {
            System.out.println("Вы совершеннолетний!");
        }
    }
}