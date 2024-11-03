package basic.Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;


        avg(x = getInteger(scanner, "Введите целое число x: "),
                y = getInteger(scanner, "Введите целое число y: "),
                z = getInteger(scanner, "Введите целое число z: "));
        scanner.close();
    }

    private static int getInteger(Scanner scanner, String prompt) {
        int num;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                return num;
            } else {
                System.out.println("Введите корректное число.");
                scanner.next(); // Игнорируем некорректный ввод
            }
        }
    }

    public static void avg(int x, int y, int z) {
        int avg = (x + y + z) / 3;
        System.out.println("Среднее арифметическое = " + avg);
        int num = (int) Math.floor(avg / 2);
        if(num > 3){
            System.out.println("Программа выполнена корректно");
        } else {
            System.out.println(num + " < 3. Программа выполнена некорректно");
        }
    }
}
