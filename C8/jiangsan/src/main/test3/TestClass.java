package main.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) throws ParseException {
        Date t1 = parse("2006-01-02 03:04:05");
        Date t2 = parse("2006-01-02");
        Date t3 = parse("2006/01/02 03:04:05");
        Date t4 = parse("2006/01/02");


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

    /**
     * @param time 待转义时间字符串
     */
    public static Date parse(String time) throws ParseException {
        //pattern的定义
        String pattern;
        if (time.contains(" ")) {
            pattern = "yyyy-MM-dd HH:mm:ss";
        } else {
            pattern = "yyyy-MM-dd";
        }

        //字符串替换
        String finalTime = time.replace('/', '-');

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        return dateFormat.parse(finalTime);
    }
}
