package classSeven;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ToolTest5 {
    //获取当前时间戳
    public static long timestamp() {
        long timestamp = System.currentTimeMillis() / 1000;
        return timestamp;
    }

    //获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
    public static String stringTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());// new Date()为获取当前系统时间
    }

    //Date转yyyy-MM-dd HH:mm:ss格式的字符串
    public static String dateToString() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return  df.format(date);
    }

    //任意字符串转Date
    public static Date stringToData(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date returnDate = null;
        try {
            Date time = sdf.parse(str);
            returnDate =   new Date(time.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnDate;
    }
}
