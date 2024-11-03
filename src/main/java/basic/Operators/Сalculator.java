package basic.Operators;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        calc();
    }


    public static void calc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float num2 = scanner.nextFloat();
        System.out.println("Выберите действие: +, -, *, /");
        char action = scanner.next().charAt(0);
        float result = 0f;

        scanner.close();


        switch (action) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.printf("%.4f", result);
    }
}