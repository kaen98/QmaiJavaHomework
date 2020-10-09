package C8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 你的上次生日过了多少天？下次生日还有多少天？
 */
public class Q1 {
    public static void main(String[] args)  throws ParseException {
        //设置转换的日期格式
        SimpleDateFormat fmat = new SimpleDateFormat("yyyy-MM-dd");

        //上一次生日
        Date birthday = fmat.parse("2019-10-08");
        //下一次生日
        Date afterBirthday = fmat.parse("2020-10-08");
        //当前时间
        Date now = new Date();

        //得到相差的天数 betweenDate
        long betweenDate1 = (now.getTime() - birthday.getTime())/(60*60*24*1000);
        long betweenDate2 = (afterBirthday.getTime() - now.getTime())/(60*60*24*1000);

        System.out.println("上次生日过了多少天:" + betweenDate1);
        System.out.println("下次生日还有多少天:" + betweenDate2);

    }
}
