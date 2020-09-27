package classSeven;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test4 {
    public static void main(String[] strings) throws ParseException {
        //写个方法，判断上/下午，boolean isAfternoon(String s)，调用方式，如：isAfternoon("2006-01-02 03:04:05")
        String str = "2006-01-02 03:04:05是否是下午：";
        if(isAfternoon("2006-01-02 15:04:05")) {
            str += "是的";
        } else {
            str += "不是";
        }
        System.out.println(str);

    }

    public static  boolean isAfternoon(String s) throws ParseException {
        DateFormat format1 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        DateFormat format2 = new SimpleDateFormat("HH");
        Date date = format1.parse(s);
        int hour=Integer.parseInt(format2.format(date));
        if(hour > 12) {
            return true;
        }
        return false;
    }
}
