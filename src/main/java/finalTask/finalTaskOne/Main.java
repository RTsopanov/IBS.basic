package finalTask.finalTaskOne;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double dollarRate = getDollae(scanner);


        double rubles = getRubles(scanner);

        getrusult(rubles, dollarRate);

        scanner.close();
    }




    private static void getrusult(double rubles, double dollarRate) {
        double resultDdollars = rubles / dollarRate;
        System.out.printf("%.2f долларов", resultDdollars);
    }



    private static double getDollae(Scanner scanner) {
        double dollar = -1;
        while (dollar < 0 || dollar == 0) {
            System.out.println("Введите курс доллара:");
            if (scanner.hasNextDouble()) {
                dollar = scanner.nextDouble();
                if (dollar < 0 || dollar == 0) {
                    System.out.println("Курс доллара должен быть > 0.");
                }
            } else {
                System.out.println("Некорректное значение. Введите положительное число: ");
                scanner.next();
            }
        }
        return dollar;
    }


    private static double getRubles(Scanner scanner) {
        int rub = -1;
        while (rub < 0) {
            System.out.println("Введите количество рублей:");
            if (scanner.hasNextDouble()) {
                rub = scanner.nextInt();
                if (rub < 0) {
                    System.out.println("Количество рублей должно быть положительным.");
                }
            } else {
                System.out.println("Некорректное значение. Введите положительное число: ");
                scanner.next();
            }
        }
        return rub;
    }
}

