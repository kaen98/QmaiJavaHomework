/**
 * 输出9*9乘法表
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/25 8:53 下午
 */
public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }
}
