package C8;

import java.text.SimpleDateFormat;
import java.util.Date;

class Q5 {
    public static void main(String[] args) {
        /**
         *写个时间工具类，包括4个方法：
         * 获取当前时间戳（秒）
         * 获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
         * Date转yyyy-MM-dd HH:mm:ss格式的字符串
         * 任意字符串转Date
         */
        Date date=null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             date=sdf.parse("2020-09-21 14:11:23");
        }catch (Exception e) {

        }

        Dt d = new Dt();
        //获取当前时间戳（秒）
        System.out.println(d.getTime());
        //获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
        System.out.println(d.getDate());
        //Date转yyyy-MM-dd HH:mm:ss格式的字符串
        System.out.println(d.dateToStr(date));
        //任意字符串转Date
        System.out.println(d.strToDate("2020-09-21 14:11:23"));
    }
}

class Dt {
    private long time = 0;
    public long getTime(){
        this.time = System.currentTimeMillis();
        return this.time/1000L;
    }
    public String getDate(){
        String sd = "";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sd = sdf.format(new Date(this.time)); // 时间戳转换日期
        return sd;
    }

    public String dateToStr(Date s){
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df1.format(s);
    }

    public Date strToDate(String s){
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            date=sdf.parse(s);
        }catch (Exception e) {

        }
        return date;
    }
}