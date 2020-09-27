package C9;

class Q2 {
    public static void main(String[] args) {
       // 1.将int数组【99、23、34、67、123、234、1、98】按照升序排列
        int[] arr={99,23,34,67,123,234,1,98};
        for (int i=0;i<arr.length;i++) {
            for(int o=0;o<arr.length;o++){
                if (arr[i] < arr[o]) {
                    int a = arr[o];
                    arr[o] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(i+":"+arr[i]);
        }
    }
}
