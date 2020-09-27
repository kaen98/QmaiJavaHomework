import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 你的上次生日过了多少天？下次生日还有多少天？
 */
public class Q1 {
    public static void main(String[] args) throws ParseException {
        // 时间格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 12:mm:ss");

        // 当前时间
        Date now = new Date();
        long nowTime = now.getTime();
        System.out.println(format.format(now));

        // 上一次生日
        Date lastBirthday = format.parse("2019-11-20 12:00:00");
        long lastBirthdayTime = lastBirthday.getTime();
        System.out.println("上一次生日:" + format.format(lastBirthday));
        System.out.println("上一次生日过了：" + getDayOf(lastBirthdayTime, nowTime) + "天");

        // 下一次生日
        Date nextBirthday = format.parse("2020-11-20 12:00:00");
        long nextBirthdayTime = nextBirthday.getTime();
        System.out.println("下一次生日:" + format.format(nextBirthday));
        System.out.println("下一次生日还有：" + getDayOf(nowTime, nextBirthdayTime) + "天");

    }

    public static long getDayOf(long start, long end) {
        long mid = end - start;
        return mid / (24 * 3600 * 1000);
    }
}
