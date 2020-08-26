/**
 * 写一段死循环程序代码，30s后跳出循环。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/25 8:52 下午
 */
public class Demo3 {
    public static void main(String[] args) {
        //开始时间（如果要控制时间精度，可调用System.nanoTime()，此时间单位ns）
        long startTime = System.currentTimeMillis();
        //结束时间
        long endTime = 0;
        //程序执行时间
        long time = 0;
        //睡眠时间(单位：ms)
        int sleep = 30000;

        System.out.println("开始时间戳：" + startTime);

        do {
            endTime = System.currentTimeMillis();
            time = endTime - startTime;
        } while (time <= sleep);

        System.out.println("结束时间戳：" + endTime);
    }
}
