package finalTask.Three;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String maxString = "";
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String currentString = scanner.nextLine();

            Set<Character> uniqueChars = new HashSet<>();
            for (char c : currentString.toCharArray()) {
                uniqueChars.add(c);
            }

            int Count = uniqueChars.size();
            if (Count > maxCount) {
                maxCount = Count;
                maxString = currentString;
            }
        }
        System.out.println("Ответ: " + maxString);
    }
}

