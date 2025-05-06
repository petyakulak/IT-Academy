package org.example;

import java.util.Scanner;

public class Convertation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите сумму в долларах: ");
        double dollar = console.nextDouble();
        double map = 0.85;

        double convert = dollar * map;
        System.out.println("Сумма в евро: " + convert);
    }
}