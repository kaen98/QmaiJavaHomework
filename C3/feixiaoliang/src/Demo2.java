import java.util.Random;

/**
 * 写一段程序代码，利用Random类生成1个1000以内的随机数字，猜出这个数字，考虑尽可能的降低时间复杂度。生成随机数字代码如下:
 * Random random = new Random();
 * int num = random.nextInt(1000);
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/25 8:52 下午
 */
public class Demo2 {
    public static void main(String[] args) {
        //最大区间值、最小区间值
        int max = 1000, min = 0;

        Random random = new Random();
        //随机值
        int num = random.nextInt(max);
        System.out.println("随机数：" + num);

        //初始游标变量
        int cursor = max / 2;

        //次数
        int count = 1;

        while (cursor > 0) {
            if(num == max){
                System.out.println("第" + count + "次得出结果：" + max);
                break;
            }

            if (num > cursor) {
                min = cursor;
            } else if (num < cursor) {
                max = cursor;
            } else {
                System.out.println("第" + count + "次得出结果：" + cursor);
                break;
            }

            //重置游标位置
            cursor = min + (max - min) / 2;

            //次数+1
            count++;
        }
    }
}
