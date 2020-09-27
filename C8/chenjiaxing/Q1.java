package C8;

import java.text.SimpleDateFormat;
import java.util.Date;

class Q1 {
    public static void main(String[] args) {
        //第一题：你的上次生日过了多少天？下次生日还有多少天？
        long timestamp = System.currentTimeMillis() / 1000L;
        try {
            SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            SimpleDateFormat year = new SimpleDateFormat("yyyy");
            String year_1 = year.format(new Date());
            String bir = String.valueOf(simple.parse(year_1 + "-08-25 00:00:00").getTime()/1000);
            long old_bir = (timestamp - Long.parseLong(bir)) / (3600 * 24);
            //当前时间-上次生日时间
            if (old_bir >= 0) {
                System.out.println("距离上次生日过了"+old_bir+"天");
                long year_2 = Long.parseLong(year_1) + 1;
                String now_bir = String.valueOf(simple.parse(year_2 + "-08-25 00:00:00").getTime()/1000);
                System.out.println("下次生日还有"+((Long.parseLong(now_bir) - timestamp) / (3600 * 24))+"天");
            } else{
                long year_2 = Long.parseLong(year_1) - 1;
                bir = String.valueOf(simple.parse(year_2 + "-08-25 00:00:00").getTime()/1000);
                old_bir = (timestamp - Long.parseLong(bir)) / (3600 * 24);
                System.out.println("距离上次生日过了"+old_bir+"天");
                bir = String.valueOf(simple.parse(year_1 + "-08-25 00:00:00").getTime()/1000);
                System.out.println("下次生日还有"+((Long.parseLong(bir) - timestamp) / (3600 * 24))+"天");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
