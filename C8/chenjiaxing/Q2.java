package C8;

import java.util.Random;

class Q2 {
    public static void main(String[] args) {
        //第二题：用random生成1000个[0,10]之间的随机数，记录每个数出现次数，如果0-9每个数出现100次说明random生成的随机数是均匀的，如果0出现200次，1出现0次说明不均匀
        int[] a = new int[10];
        Random random = new Random();

        for(int i=0;i < 1000;i++){
            int randomNum = random.nextInt(10);
            a[randomNum] += 1;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(i+"出现次数:"+a[i]);
        }
    }
}
