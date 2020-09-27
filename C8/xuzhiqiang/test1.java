package classSeven;

import java.util.Calendar;

public class test1 {
    //你的上次生日过了多少天？下次生日还有多少天？
    public static void main(String[] strings) {
        Calendar calendar = Calendar.getInstance();
        long nowTime = calendar.getTimeInMillis();
        calendar.add(Calendar.YEAR, 0);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 27);
        long lastBirthdayTime = calendar.getTimeInMillis();
        int usedDay = (int) ((nowTime - lastBirthdayTime) / 1000 / (60 * 60 *24));

        System.out.println("上次生日是"+usedDay+"天前");

        calendar.add(Calendar.YEAR, 1);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 27);
        long nextBirthdayTime = calendar.getTimeInMillis();
        int leftDay = (int) ((nextBirthdayTime - nowTime) / 1000 / (60 * 60 *24));
        System.out.println("下次生日还剩"+leftDay+"天");
    }
}
