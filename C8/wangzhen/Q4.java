package C8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 写个方法，判断上/下午，boolean isAfternoon(String s)，调用方式，如：isAfternoon("2006-01-02 03:04:05")
 */
public class Q4 {
    public static void main(String[] args)  throws ParseException {
        if (isAfternoon("2006-01-02 11:04:05")) {
            System.out.println("是下午");
        } else {
            System.out.println("是上午");
        }
    }

    public static boolean isAfternoon (String s)  throws ParseException
    {
        SimpleDateFormat fmat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = fmat.parse(s);
        if (time.getHours() < 12) {
            return false;
        }
        return true;
    }
}
