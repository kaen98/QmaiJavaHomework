package main.test2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 1000; i++) {
            int index = (int) (Math.random() * 10);
            arr[index]++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
