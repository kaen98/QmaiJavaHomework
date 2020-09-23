/**
 * 用Random，生成1000个[0, 10)之间的随机数，记录每个数出现次数。如果0、1、2、3、4、5、6、7、8、9每个数出现100次，
 * 说明Random生成的整数是均匀的。如果0出现200次，1出现0次，说明不均匀。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/22 10:58 下午
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] log = new int[10];
        int count = 1000,i, l = 0;

        for (i = 1; i <= count; i++) {
            double num = Math.random();
            double num1 = num * 10;
            int randomNum = (int) num1;
            log[randomNum] += 1;
        }

        for (int num : log) {
            System.out.println(l + "出现次数：" + num);
            l++;
        }
    }
}
