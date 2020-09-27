package src;

/**
 * 将int数组【99、23、34、67、123、234、1、98】按照升序排列
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/23 6:17 下午
 */
public class Demo2 {
    public static void main(String[] args) {

        int[] num = {99, 23, 34, 67, 123, 234, 1, 98};
        int digital;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                    digital = num[j];
                    num[j] = num[i];
                    num[i] = digital;
                }
            }
        }

        for (int p : num) {
            System.out.println(p);
        }
    }
}
