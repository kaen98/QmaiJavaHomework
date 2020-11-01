package C13;

import java.text.SimpleDateFormat;
import java.util.*;

class Q1 {
    public static void main(String[] args) {
        try {
            System.out.println(Month.getDesc(2));
        } catch (Exception e) {

        }
    }
}

enum Month{
    January(1, "1月"),
    February(2, "2月"),
    March(3, "3月"),
    April(4, "4月"),
    May(5, "5月"),
    June(6, "6月"),
    July(7, "7月"),
    August(8, "8月"),
    September(9, "9月"),
    October(10, "10月"),
    November(11, "11月"),
    December(12, "12月");

    int v;
    String str;
     Month(int v, String str){
        this.v = v;
        this.str = str;
    }
    public static String getDesc(Integer k) throws Exception{
         if (Objects.isNull(k)) {
             throw new IllegalAccessException("参数异常");
         }
         for( Month m : Month.values()) {
             if (Objects.equals(k, m.v)){
                 return m.str;
             }
         }
         throw new IllegalAccessException("参数异常");
    }
}