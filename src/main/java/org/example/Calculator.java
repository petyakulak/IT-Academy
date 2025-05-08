package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String otvet = "да";
        while (otvet.equalsIgnoreCase("да")) {
            Scanner console = new Scanner(System.in);

            System.out.println("Введите первое число: ");
            int chislo1 = console.nextInt();
            System.out.println("Введите второе число: ");
            int chislo2 = console.nextInt();

            console.nextLine(); //очистка буфера
            System.out.println("Введите операцию (+,-,*,/): ");
            String oper = console.nextLine();

            switch (oper) {
                case "+":
                    System.out.println(chislo1 + chislo2);
                    break;
                case "-":
                    System.out.println(chislo1 - chislo2);
                    break;
                case "*":
                    System.out.println(chislo1 * chislo2);
                    break;
                case "/":
                    if (chislo2 != 0) {
                        System.out.println(chislo1 / chislo2);
                        break;
                    } else {
                        System.out.println("Ошибка! Деление на ноль!");
                        break;
                    }
                default:
                    System.out.println("Неверная операция!");
                    break;
            }

            System.out.println("Хотите ли вы продолжить? (да/нет): ");
            String otvet1 = console.nextLine();
            otvet = otvet1;
        }
    }
}
