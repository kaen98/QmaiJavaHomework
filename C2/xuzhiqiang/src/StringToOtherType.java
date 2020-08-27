public class StringToOtherType {
//    写个工具类，实现类型转换，String 转 (int、long、float、double、byte[])，(byte[]、int) 转 String
    //string转int
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    //string转long
    public static long stringToLong(String str) {
        return Long.parseLong(str);
    }

    //string转float
    public static float stringToFloat(String str) {
        return Float.parseFloat(str);
    }

    //String转double
    public static double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

    //string转byte[]
    public static byte[] stringToByte(String str) {
        return str.getBytes();
    }

    //byte[] 转 string
    public static String byteToString(byte[] bytes) {
        return new String(bytes);
    }

    //int 转string
    public static String intToString(int i) {
        return String.valueOf(i);
    }
}
