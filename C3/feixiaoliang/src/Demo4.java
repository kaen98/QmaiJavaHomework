/**
 * 判断101-200之间有多少个素数，并输出所有素数。
 * 素数：一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做素数
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/25 8:53 下午
 */
public class Demo4 {
    public static void main(String[] args) {
        //定义101-200区间值
        int min = 101, max = 200;

        for (int i = min; i <= max; i++) {
            //是否是素数
            boolean flag = true;
            for (int j = min; j < i; j++) {
                //如果数字非素数跳出循环判断下一个数字
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            //打印素数
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
