import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 你的上次生日过了多少天？下次生日还有多少天？
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/22 10:30 下午
 */
public class Demo1 {
    public static void main(String[] args) {
        //获取当前时间
        Calendar nowCalendar = Calendar.getInstance();
        long nowTime = nowCalendar.getTimeInMillis();

        System.out.println("生日6月29日");

        //上次生日
        Calendar calendar = Calendar.getInstance();
        int year = 2019;
        int month = 6;
        int day = 29;
        calendar.add(Calendar.YEAR, (year - 2020));
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);
        long lastBirthdayTime = calendar.getTimeInMillis();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间:" + simpleDateFormat.format(nowCalendar.getTime()));
        System.out.println("上次生日:" + simpleDateFormat.format(calendar.getTime()));
        System.out.println("上次生日过了" + (nowTime - lastBirthdayTime) / 1000 / 60 / 60 / 24 + "天");

        //下次生日
        calendar.add(Calendar.YEAR, 2);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);
        long nextBirthdayTime = calendar.getTimeInMillis();

        System.out.println("下次生日:" + simpleDateFormat.format(calendar.getTime()));
        System.out.println("下次生日还有" + (nextBirthdayTime - nowTime) / 1000 / 60 / 60 / 24 + "天");
    }
}
