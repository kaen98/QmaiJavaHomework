import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 写个方法，判断上/下午，boolean isAfternoon(String s)，调用方式，如：isAfternoon("2006-01-02 03:04:05")
 */
public class Q4 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isAfternoon("2006-01-02 03:04:05"));
        System.out.println(isAfternoon("2006-01-02 12:04:05"));
    }

    public static boolean isAfternoon(String s) throws ParseException {
        // 传入的时刻
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = format.parse(s);

        // 中午时刻
        SimpleDateFormat noonFormat = new SimpleDateFormat("yyyy-MM-dd 12:00:00");
        String noonString = noonFormat.format(d);
        Date noonDate = format.parse(noonString);

        if (noonDate.getTime() < d.getTime()) {
            return true;
        }
        return false;
    }
}
