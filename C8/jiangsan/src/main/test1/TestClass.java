package main.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 你的上次生日过了多少天？下次生日还有多少天？
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String now = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
        long day1 = dateDiff("2019-10-01 12:00:00", now);
        long day2 = dateDiff(now, "2020-10-01 12:00:00");

        System.out.println("距离上次过生日已经过去了：" + day1);
        System.out.println("距离下次过生日还有：" + day2);
    }

    public static long dateDiff(String endDate, String startDate) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        long nd = 1000 * 24 * 60 * 60;
        long diff = dateFormat.parse(startDate).getTime() - dateFormat.parse(endDate).getTime();

        return diff / nd;
    }
}
