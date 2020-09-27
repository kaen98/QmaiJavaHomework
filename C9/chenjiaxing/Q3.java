package C9;

import com.sun.security.jgss.GSSUtil;

class Q3 {
    public static void main(String[] args) {
       //2.去掉数组【1、2、3、4、2、2、1、5、6】中的重复元素。
        int[] arr = {1,2,3,4,2,2,1,5,6};
        int[]b = new int[9];
        int t=0;

        for(int i=0;i<arr.length;i++){
            boolean isRepeat = true;
            for(int o=i+1;o<arr.length;o++){
                if(arr[i]==arr[o]){
                    isRepeat = false;
                    break;
                }
            }
            if(isRepeat){
                b[t] = arr[i];
                t++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(i+":"+b[i]);
        }

    }
}
