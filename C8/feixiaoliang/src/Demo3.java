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
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/22 11:19 下午
 */
public class Demo3 {
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

    public static Date parse(String s) throws ParseException {
        String pattern;
        if (s.indexOf(" ") != -1) {
            pattern = "yyyy-MM-dd HH:mm:ss";
        } else {
            pattern = "yyyy-MM-dd";
        }

        String dateString = s.replace("/", "-");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return simpleDateFormat.parse(dateString);
    }
}
