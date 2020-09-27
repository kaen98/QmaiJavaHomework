package C8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Q3 {
    public static void main(String[] args) {
        /**
         *
         * 写个方法，字符串转Date，Date parse(String s)，调用方式，如：
         * Date t1 = parse("2006-01-02 03:04:05")
         * Date t2 = parse("2006-01-02")
         * Date t3 = parse("2006/01/02 03:04:05")
         * Date t4 = parse("2006/01/02")
         * 注1：不可增加日期格式参数，如：Date parse(String s, String pattern)，pattern 传 yyyy-MM-dd HH:mm:ss
         * 注2：可用三方工具类
         */
        Date t1 = parse("2006/01/02");
        System.out.println(t1);
    }

    public static Date parse(String str){
        String i = "";
        String[] s = new String[3];
        s[0] = "yyyy-MM-dd";
        s[1] = "yyyy/MM/dd";
        s[2] = " HH:mm:ss";
        if (str.indexOf("-") >= 0){
            i +=s[0];
        } else {
            i +=s[1];
        }
        if(str.indexOf(" ") >= 0){
            i += s[2];
        }
        Date d =null;
        try{
            DateFormat format1 = new SimpleDateFormat(i);
            d = format1.parse(str);
        } catch (Exception e) {}
        return d;
    }
}
