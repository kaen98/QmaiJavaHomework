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
    public static void main(String[] args) throws ParseException {
        Date t1 = parse("2006-01-02 03:04:05");
        Date t2 = parse("2006-01-02");
        Date t3 = parse("2006/01/02 03:04:05");
        Date t4 = parse("2006/01/02");
//        Date tError = parse("2006 01 02");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

    public static Date parse(String s) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat format4 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            return format1.parse(s);
        }catch (ParseException e) {

        }

        try {
            return format2.parse(s);
        }catch (ParseException e) {

        }

        try {
            return format3.parse(s);
        }catch (ParseException e) {

        }

        try {
            return format4.parse(s);
        }catch (ParseException e) {

        }

        throw new ParseException("无法解析", 401);
    }
}
