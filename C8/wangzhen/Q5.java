package C8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 写个时间工具类，包括4个方法：
 * 获取当前时间戳（秒）
 * 获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
 * Date转yyyy-MM-dd HH:mm:ss格式的字符串
 * 任意字符串转Date
 */
public class Q5 {
    public static void main(String[] args) throws ParseException {
        //获取当前时间戳（秒）
        System.out.println(dateUtil.getMinus());
        //获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
        System.out.println(dateUtil.getNow());
        //Date转yyyy-MM-dd HH:mm:ss格式的字符串
        System.out.println(dateUtil.getDateString(new Date()));
        //任意字符串转Date
        System.out.println(dateUtil.toDate("2010-10-10 10:10:10"));
    }

}

class dateUtil {
    public static long getMinus()
    {
        return System.currentTimeMillis()/ 1000L;
    }

    public static String getNow()
    {
        return getDateString(new Date());
    }

    public static String getDateString(Date time)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(time);
    }

    public static Date toDate(String time) throws ParseException {
        String formatModel = "yyyy-MM-dd HH:mm:ss";
        if (time.contains("/")) {
            formatModel = "yyyy/MM/dd HH:mm:ss";
        }
        if (!time.contains(" ")) {
            formatModel = formatModel.substring(0, formatModel.indexOf(" "));
        }

        SimpleDateFormat format = new SimpleDateFormat(formatModel);

        try {
            return format.parse(time);
        }catch (ParseException e) {

        }

        throw new ParseException("无法解析", 401);
    }
}
