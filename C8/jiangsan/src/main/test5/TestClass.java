package main.test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间戳（秒）
 * 获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
 * Date转yyyy-MM-dd HH:mm:ss格式的字符串
 * 任意字符串转Date
 *
 * @author san
 */
public class TestClass {

    /**
     * 当前时间戳（秒）
     *
     * @return Long
     */
    public static Long nowTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }


    public static String nowTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return simpleDateFormat.format(new Date());
    }

    public static String nowTimeString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return simpleDateFormat.format(date);
    }

    public static Date parse(String s) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.parse(s);
    }

    public static void main(String[] args) throws ParseException {

        System.out.println(nowTimeStamp());

        System.out.println(nowTime());

        System.out.println(nowTimeString(new Date()));

        System.out.println(parse("2020/12/02"));
    }
}
