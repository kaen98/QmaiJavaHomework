### Q1 写一段会员打折的程序代码，规则如下：
1级会员消费满100打9折；
2级会员消费满100打8折，满200打7.5折
3级会员消费满100打7折，满200打6.5折，满300打6折；
非会员消费满500打9折；
```
public class Q1
{
    public static void main(String[] args)
    {
        System.out.println(getDiscount(0, 500));
        System.out.println(getDiscount(1, 100));
        System.out.println(getDiscount(4, 100));
    }

    /**
     * 获取折扣
     * @param member_level 会员等级
     * @param order_paid_amount 消费金额
     */
    public static double getDiscount(int member_level, double order_paid_amount)
    {
        switch (member_level) {
            case 1:
                if (order_paid_amount >= 100) {
                    return 9.0;
                }
                break;
            case 2:
                if (order_paid_amount >= 200) {
                    return 7.5;
                }
                if (order_paid_amount >= 100) {
                    return 8.0;
                }
                break;
            case 3:
                // 3级会员消费满100打7折，满200打6.5折，满300打6折；
                if (order_paid_amount >= 300) {
                    return 6.0;
                }
                if (order_paid_amount >= 200) {
                    return 6.5;
                }
                if (order_paid_amount >= 100) {
                    return 7.0;
                }
                break;
            default:
                if (order_paid_amount >= 500) {
                    return 9.0;
                }
        }

        return 10.0;
    }
}
```

### Q2 写一段程序代码，利用Random类生成1个1000以内的随机数字，猜出这个数字，考虑尽可能的降低时间复杂度。生成随机数字代码如下:
Random random = new Random();
int num = random.nextInt(1000);
```
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

```

### Q3 写一段死循环程序代码，30s后跳出循环。
```
public class Q3
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("程序开始时间：" + now.toString());

        // 延迟30s后， 终止程序
        (new Timer()).schedule(new Stop(), 30000);
        while (true) {

        }

    }
}

public class Stop extends TimerTask {
    @Override
    public void run() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("程序终止时间：" + now.toString());
        System.exit(0);
    }
}


```


### Q4 判断101-200之间有多少个素数，并输出所有素数。
素数：一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做素数
```
public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i = 101; i <= 200; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        System.out.println(primeList.size());
        System.out.println(primeList);
    }

    public static boolean isPrime(int n) {
        if (1 < n && n <= 3) {
            return true;
        }
        for(int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

### Q5 输出9*9乘法表
```
public class Q5 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print(i + "*" + j + " = " + i * j);
                System.out.print("; ");
            }
            System.out.println();
        }
    }
}

```
