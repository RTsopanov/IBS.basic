package basic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 2, 3, 4, 1};
        int indexOne;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            indexOne = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = indexOne;
            sum = array[0] + array[array.length / 2];

        }

        System.out.println(sum);
    }
}
