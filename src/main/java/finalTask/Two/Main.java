package finalTask.Two;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getNumber();
    }


    public static void getNumber() {
        while (true) {
            System.out.println("Введите уравнение вида 'x+n1=n2', 'n1+x=n2' или 'n1+n2=x', где n1 и n2 - числа от 0 до 9: ");
            int result = 0;
            String string = scanner.nextLine();
            char[] array = string.toCharArray();

            if (string.equals("exit")) {
                break;
            }

            if (array.length != 5 || array[3] != '=') {
                System.out.println("Некорректное выражение.");
                continue;
            }

            if (array[1] == '+' && array[0] == 'x' && Character.isDigit(array[2]) && Character.isDigit(array[4])) {
                result = Character.getNumericValue(array[4]) - Character.getNumericValue(array[2]);
                System.out.println("x = " + result);
            } else if (array[1] == '-' && array[0] == 'x' && Character.isDigit(array[2]) && Character.isDigit(array[4])) {
                result = Character.getNumericValue(array[4]) + Character.getNumericValue(array[2]);
                System.out.println("x = " + result);
            } else if (array[1] == '+' && array[2] == 'x' && Character.isDigit(array[0]) && Character.isDigit(array[4])) {
                result = Character.getNumericValue(array[4]) - Character.getNumericValue(array[0]);
                System.out.println("x = " + result);
            } else if (array[1] == '-' && array[2] == 'x' && Character.isDigit(array[0]) && Character.isDigit(array[4])) {
                result = Character.getNumericValue(array[0]) - Character.getNumericValue(array[4]);
                System.out.println("x = " + result);
            } else if (array[1] == '+' && array[4] == 'x' && Character.isDigit(array[0]) && Character.isDigit(array[2])) {
                result = Character.getNumericValue(array[0]) + Character.getNumericValue(array[2]);
                System.out.println("x = " + result);
            } else if (array[1] == '-' && array[4] == 'x' && Character.isDigit(array[0]) && Character.isDigit(array[2])) {
                result = Character.getNumericValue(array[0]) - Character.getNumericValue(array[2]);
                System.out.println("x = " + result);
            } else {
                System.out.println("Некорректная структура уравнения.");
            }
        }
    }


}



