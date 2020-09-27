package main.test4;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        Boolean is = isAfternoon("2006-01-02 03:04:05");

        System.out.println(is);
    }

    /**
     * 写个方法，判断上/下午，boolean isAfternoon(String s)，调用方式，如：isAfternoon("2006-01-02 03:04:05")
     *
     * @param time 时间字符串
     * @return Boolean
     */
    public static Boolean isAfternoon(String time) {
        return Integer.parseInt(time.substring(11, 12)) > 0;
    }
}
