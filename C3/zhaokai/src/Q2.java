import java.util.Random;

public class Q2
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int num = random.nextInt(1000);
        System.out.println("随机数为" + num);

        // 定义 1 ~ 1000的有序数组
        int[] list = new int[1000];
        for(int i = 0; i < 1000; i++) {
            list[i] = i + 1;
        }

        // 二分查找
        Q2.bsearch(list, num);
    }

    public static int bsearch(int[] list, int value)
    {
        int low = 0;
        int high = list.length - 1;
        int mid;
        int serarchCount = 0;

        while (low <= high) {
            serarchCount++;
            System.out.println("第" + serarchCount + "次猜数：");
            mid = (low + high) / 2;
            if (value == list[mid]) {
                System.out.println("猜对了：" + list[mid]);
                return mid;
            } else if (value < list[mid]) {
                System.out.println("猜：" + list[mid]);
                System.out.println("结果：大了");
                high = mid - 1;
            } else {
                System.out.println("猜：" + list[mid]);
                System.out.println("结果：小了");
                low = mid + 1;
            }
        }

        System.out.println("未猜到：" + value);
        return -1;
    }
}
