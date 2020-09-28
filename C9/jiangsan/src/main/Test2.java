package main;

import java.util.Arrays;

/**
 * 将int数组【99、23、34、67、123、234、1、98】按照升序排列
 *
 * @author san
 */
public class Test2 {
    public static void main(String[] args) {
        int[] item = {99, 23, 34, 67, 123, 234, 1, 98};

        Arrays.sort(item);

        System.out.println(Arrays.toString(item));
    }
}
