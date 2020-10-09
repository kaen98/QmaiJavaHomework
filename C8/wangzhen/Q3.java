package C8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 写个方法，字符串转Date，Date parse(String s)，调用方式，如：
 * Date t1 = parse("2006-01-02 03:04:05")
 * Date t2 = parse("2006-01-02")
 * Date t3 = parse("2006/01/02 03:04:05")
 * Date t4 = parse("2006/01/02")
 * 注1：不可增加日期格式参数，如：Date parse(String s, String pattern)，pattern 传 yyyy-MM-dd HH:mm:ss
 * 注2：可用三方工具类
 */
public class Q3 {
    public static void main(String[] args) throws ParseException{
        Date t1 = parse("2006-01-02 03:04:05");
        Date t2 = parse("2006-01-02");
        Date t3 = parse("2006/01/02 03:04:05");
        Date t4 = parse("2006/01/02");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

    public static Date parse(String time) throws ParseException {
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
