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

