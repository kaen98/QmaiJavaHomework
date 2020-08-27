import java.util.*;

public class ThirdQ3ThirtyDie {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

//        try {
            //noinspection
            while (true) {
                Date now = new Date();
                long end = now.getTime();
                if ((end - d.getTime()) >= 30000) {
                    System.out.println("已完成");
                    Date e = new Date();
                    System.out.println(e);
                    break;
                } else {
//                    System.out.print("ing");
                }
            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
