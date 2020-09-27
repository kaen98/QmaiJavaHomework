import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * 写个时间工具类，包括4个方法：
 * 获取当前时间戳（秒）
 * 获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
 * Date转yyyy-MM-dd HH:mm:ss格式的字符串
 * 任意字符串转Date
 */
public class Q5 {
    public static void main(String[] args) throws ParseException {
        System.out.println("获取当前时间戳（秒):");
        System.out.println(TimeUitl.nowTimestamp());

        System.out.println("\n 获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串:");
        System.out.println(TimeUitl.nowDateTime());

        System.out.println("\n Date转yyyy-MM-dd HH:mm:ss格式的字符串:");
        System.out.println(TimeUitl.toDateTime(new Date()));

        System.out.println("\n 任意字符串转Date:");
        System.out.println(TimeUitl.toDate("2006-01-02 03:04:05"));
        System.out.println(TimeUitl.toDate("2006-01-02"));
        System.out.println(TimeUitl.toDate("2006/01/02 03:04:05"));
        System.out.println(TimeUitl.toDate("2006/01/02"));
    }
}

class TimeUitl {
    public static long nowTimestamp()
    {
        return (new Date()).getTime() / 1000;
    }

    public static String nowDateTime()
    {
        return toDateTime(new Date());
    }

    public static String toDateTime(Date d)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(d);
    }

    public static Date toDate(String s) throws ParseException {
        return Q3.parse(s);
    }
}
