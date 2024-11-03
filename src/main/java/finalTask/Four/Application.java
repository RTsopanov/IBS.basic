package finalTask.Four;

import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        riddle();
    }


    public static void riddle() {
        int num = 3;
        String string;
        String answer = "Заархивированный вирус";
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        while (num != 0) {
            string = scanner.nextLine();
            if (string.equalsIgnoreCase(answer)) {
                System.out.println("Правильный ответ!");
                break;
            }


            if (num == 3 && string.equalsIgnoreCase("подсказка")) {
                System.out.println("... вирус");
                string = scanner.nextLine();
                if (!string.equalsIgnoreCase("заархивированный вирус")) {
                    System.out.println("Обидно, приходи в другой раз");
                } else {
                    System.out.println("Правильный ответ!");
                }
                break;
            } else if (num != 3 && string.equalsIgnoreCase("подсказка")) {
                System.out.println("Подсказка уже недоступна");
                continue;
            }


            num--;
            System.out.println("Подумай еще.\nУ вас осталось " + num + " попыток.");


            if (num == 0) {
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
