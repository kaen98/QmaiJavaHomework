package C8;

/**
 * 用Random，生成1000个[0, 10)之间的随机数，
 * 记录每个数出现次数。如果0、1、2、3、4、5、6、7、8、9每个数出现100次，
 * 说明Random生成的整数是均匀的。如果0出现200次，1出现0次，说明不均匀。
 */
public class Q2 {
    public static void main(String[] args) {
        int[] arrList = new int[10];
        for (int i = 0; i < 1000; i++) {
            int num = (int)(Math.random() * 10);
            arrList[num]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "出现" + arrList[i] + "次");
        }
        //结论：近似均匀，非绝对均匀。
    }
}
