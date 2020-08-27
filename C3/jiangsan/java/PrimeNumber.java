import java.util.ArrayList;
import java.util.List;

/**
 * 判断101-200之间有多少个素数，并输出所有素数
 *
 * @author San
 */
public class PrimeNumber {

    public static void main(String[] args) {

        int num = 0;
        int m = 101;
        int n = 200;
        int j;

        List<Integer> list = new ArrayList<Integer>();

        for (int i = m; i <= n; i++) {
            if (i % 2 == 0 && i != 2) {
                continue;
            }

            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    num++;
                    list.add(i);
                    break;
                }
            }
        }
        System.out.println("素数有" + num + "个");
        System.out.println("素数为" + list);
    }
}
