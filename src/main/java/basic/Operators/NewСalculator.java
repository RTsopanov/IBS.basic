package basic.Operators;

import java.util.Scanner;

public class NewСalculator {
    public static void main(String[] args) {
        calc();
    }


    public static void calc() {
        Scanner scanner = new Scanner(System.in);

        int numOne = getInt(scanner, "Введите первое число: ");
        int numTwo = getInt(scanner, "Введите второе число: ");
        char action = getAction(scanner, "Введите действие: ");
        int result = 0;

        scanner.close();

        switch (action) {
            case '+':
                result = numOne + numTwo;
                break;
            case '-':
                result = numOne - numTwo;
                break;
            case '*':
                result = numOne * numTwo;
                break;
            case '/':
                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("Ошибка: деление на ноль недопустимо.");
                    return;
                }
                break;
        }
        System.out.println(result);
    }


    private static char getAction(Scanner scanner, String str) {
        while (true) {
            System.out.println("Выберите действие: +, -, *, /");
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("Ошибка: введите корректный символ операции.");
            }
        }
    }


    private static int getInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.next();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное целое число.");
            }
        }

    }
}