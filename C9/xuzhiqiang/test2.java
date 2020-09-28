package classEight;

import java.util.Arrays;

public class test2 {
    public static void main(String[] strings) {
        //将int数组【99、23、34、67、123、234、1、98】按照升序排列
        int[] num = {99,23,34,67,123,234,1,98};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

}
