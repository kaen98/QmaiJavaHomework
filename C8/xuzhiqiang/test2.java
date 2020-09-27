package classSeven;

import java.util.Arrays;
import java.util.Random;

public class test2 {
    //用Random，生成1000个[0, 10)之间的随机数，记录每个数出现次数。如果0、1、2、3、4、5、6、7、8、9每个数出现100次，说明Random生成的整数是均匀的。如果0出现200次，1出现0次，说明不均匀
    public static void main(String[] strings) {

        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < 1000; i ++) {
            int val = random.nextInt(10);
            a[val] += 1;
        }
        System.out.println(Arrays.toString(a));
    }
}
