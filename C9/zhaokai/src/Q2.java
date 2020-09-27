import java.util.Arrays;

/**
 * 1.将int数组【99、23、34、67、123、234、1、98】按照升序排列。
 */
public class Q2 {
    public static void main(String[] args) {
        int[] list = {99, 23, 34, 67, 123, 234, 1, 98};
        println(list);
        Arrays.sort(list);
        println(list);
    }

    public static void println(int[] list)
    {
        for(int row : list) {
            System.out.print(row + ",");
        }
        System.out.println();
    }
}
