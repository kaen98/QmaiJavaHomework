package C9;

import java.util.Arrays;

/**
 * 1.将int数组【99、23、34、67、123、234、1、98】按照升序排列。
 */
public class Q2 {
    public static void main(String[] args){
        int[] arr = {99,23,34,67,123,234,1,98};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
