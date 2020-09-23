import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 写个方法，判断上/下午，boolean isAfternoon(String s)，调用方式，如：isAfternoon("2006-01-02 03:04:05")
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/23 4:15 下午
 */
public class Demo4 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isAfternoon("2006-01-02 03:04:05"));
    }

    public static String isAfternoon(String s) throws ParseException {
        String t = "上午";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        String hourse = simpleDateFormat.format(simpleDateFormat.parse(s));

        if (Integer.parseInt(hourse) > 12) {
            t = "下午";
        }

        return t;
    }
}
