import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 写个时间工具类，包括4个方法：
 * 获取当前时间戳（秒）
 * 获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
 * Date转yyyy-MM-dd HH:mm:ss格式的字符串
 * 任意字符串转Date
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/23 4:19 下午
 */
public class Demo5 {

    public static void main(String[] args) throws ParseException {

        System.out.println("当前时间戳：" + TimeHelp.time());
        System.out.println("当前日期：" + TimeHelp.getDate());
        System.out.println("Date转yyyy-MM-dd HH:mm:ss：" + TimeHelp.getDate(TimeHelp.getDate("2020-09-23 16:28:37")));
        System.out.println("任意字符串转Date：" + TimeHelp.getDate("2020-09-23 16:28:37"));

    }

    public static class TimeHelp {
        public static int time() {
            long time = System.currentTimeMillis() / 1000;
            return (int) time;
        }

        public static String getDate() {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.format(date);
        }

        public static String getDate(Date date) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.format(date);
        }

        public static Date getDate(String s) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.parse(s);
        }
    }

}
