package C8;

import java.text.SimpleDateFormat;
import java.util.Date;

class Q4 {
    public static void main(String[] args) {
        /**
         *
         * 写个方法，判断上/下午，boolean isAfternoon(String s)，调用方式，如：isAfternoon("2006-01-02 03:04:05")
         */
        System.out.println(isAfternoon("2006-01-02 13:04:05"));
    }

    public static boolean isAfternoon(String s) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat df1 = new SimpleDateFormat("HH");
        try {
            Date date=df.parse(s);
            int str=Integer.parseInt(df1.format(date));
            if (str >= 13) {
                return true;
            }

        }catch (Exception e){

        }
        return false;
    }
}
