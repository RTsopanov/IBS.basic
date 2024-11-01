package basic.Operators;

import java.util.Scanner;

public class Сonverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int choice = getChoice(scanner);

        switch (choice) {
            case 1:
                convertMass(scanner);
                break;
            case 2:
                convertDistance(scanner);
                break;
            default:
                System.out.println("Ошибка: неверный выбор.");
        }

        scanner.close();
    }


    private static void convertMass(Scanner scanner) {
        int unit = getUnit(scanner);

        System.out.println("Введите количество выбранных единиц:");
        double amount = scanner.nextDouble();

        switch (unit) {
            case 1:
                System.out.println("Килограммы: " + amount);
                System.out.println("Фунты: " + amount * 2.20462);
                break;
            case 2:
                System.out.println("Фунты: " + amount);
                System.out.println("Килограммы: " + amount / 2.20462);
                break;
            default:
                System.out.println("Ошибка: неверный выбор.");
        }
    }

    private static int getUnit(Scanner scanner) {
        while (true) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    return choice;
                }
            } else {
                scanner.next();
            }
            System.out.println("Введите корректное число (1 или 2).");
        }
    }


    private static void convertDistance(Scanner scanner) {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int unit = scanner.nextInt();

        System.out.println("Введите количество выбранных единиц:");
        double amount = scanner.nextDouble();

        switch (unit) {
            case 1:
                System.out.println("Метры: " + amount);
                System.out.println("Мили: " + amount / 1609.34);
                System.out.println("Ярды: " + amount * 1.09361);
                System.out.println("Футы: " + amount * 3.28084);
                break;
            case 2:
                System.out.println("Мили: " + amount);
                System.out.println("Метры: " + amount * 1609.34);
                System.out.println("Ярды: " + amount * 1760);
                System.out.println("Футы: " + amount * 5280);
                break;
            case 3:
                System.out.println("Ярды: " + amount);
                System.out.println("Метры: " + amount / 1.09361);
                System.out.println("Мили: " + amount / 1760);
                System.out.println("Футы: " + amount * 3);
                break;
            case 4:
                System.out.println("Футы: " + amount);
                System.out.println("Метры: " + amount / 3.28084);
                System.out.println("Мили: " + amount / 5280);
                System.out.println("Ярды: " + amount / 3);
                break;
            default:
                System.out.println("Ошибка: неверный выбор.");
        }
    }

    private static int getChoice(Scanner scanner) {
        while (true) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    return choice;
                }
            } else {
                scanner.next();
            }
            System.out.println("Введите корректное число (1 или 2).");
        }
    }
}
