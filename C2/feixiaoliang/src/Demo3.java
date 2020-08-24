import java.util.Arrays;

/**
 * 实现类型转换，String 转 (int、long、float、double、byte[])，(byte[]、int) 转 String
 *d
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/23 1:41 上午
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "123";

        System.out.println("string类型转double：" + Demo3.stringToDouble(s));
        System.out.println("string类型转float：" + Demo3.stringToFloat(s));
        System.out.println("string类型转int：" + Demo3.stringToInt(s));
        System.out.println("string类型转long：" + Demo3.stringToLong(s));
        System.out.println("string类型转byte[]：" + Arrays.toString(Demo3.stringToByte(s)));

        byte[] bytes = {49,50,51};
        System.out.println("byte[]类型转string：" + Demo3.toConvertDataTypes(bytes));

        int num = 123;
        System.out.println("int类型转string：" + Demo3.toConvertDataTypes(num));
    }

    /**
     * string类型转int
     *
     * @param string 字符串
     * @return 转成int
     */
    public static int stringToInt(String string) {
        return Integer.parseInt(string);
    }

    /**
     * string类型转long
     *
     * @param string 字符串
     * @return 转成long
     */
    public static Long stringToLong(String string) {
        return Long.parseLong(string);
    }

    /**
     * string类型转long
     *
     * @param string 字符串
     * @return 转成long
     */
    public static float stringToFloat(String string) {
        return Float.parseFloat(string);
    }

    /**
     * string类型转double
     *
     * @param string 字符串
     * @return 转成double
     */
    public static Double stringToDouble(String string) {
        return Double.parseDouble(string);
    }

    /**
     * string类型转byte[]
     *
     * @param string 字符串
     * @return 转成byte
     */
    public static byte[] stringToByte(String string) {
        return string.getBytes();
    }

    /**
     * byte[]类型转string
     *
     * @param bytes byte[]字符串
     * @return 转成string
     */
    public static String toConvertDataTypes(byte[] bytes) {
        return new String(bytes);
    }

    /**
     * int类型转string
     *
     * @param string 字符串
     * @return 转成string
     */
    public static String toConvertDataTypes(int string) {
        return String.valueOf(string);
    }
}
