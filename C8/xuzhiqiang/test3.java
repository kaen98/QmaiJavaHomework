package classSeven;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test3 {
    public static void main(String[] strings) throws ParseException {
//        写个方法，字符串转Date，Date parse(String s)，调用方式，如：
//        Date t1 = parse("2006-01-02 03:04:05")
//        Date t2 = parse("2006-01-02")
//        Date t3 = parse("2006/01/02 03:04:05")
//        Date t4 = parse("2006/01/02")
//        注1：不可增加日期格式参数，如：Date parse(String s, String pattern)，pattern 传 yyyy-MM-dd HH:mm:ss
//        注2：可用三方工具类
//        Date time = parse("2006-01-02 03:04:05");
        try {
            String string = "2006*01*02 03:04:05";
            System.out.println(parse(string));
        } catch (ParseException e) {
            System.out.println("程序错误");
        }
    }

    public static Date parse(String string) throws ParseException {
        String ymd;
        String his = "";
        String pattern = "yyy-MM-dd";
        if (string.indexOf(" ") > 0) {
            int index = string.indexOf(" ");
            ymd = string.substring(0, index);
            his = string.substring(index);
            pattern += " HH:mm:ss";
        } else {
            ymd = string;
        }

        //获取【日】前一位的特殊字符
        String symbol = ymd.substring(ymd.length()-3, ymd.length()-2);
        char[] ss = symbol.toCharArray();
        ymd = ymd.replace(ss[0], '-');
        String time = ymd+his;
        DateFormat format1 = new SimpleDateFormat(pattern);

        return format1.parse(time);
    }
}
