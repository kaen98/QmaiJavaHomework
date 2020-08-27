public class Q3Sub {
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static long stringToLong(String str) {
        return Long.parseLong(str);
    }

    public static float stringToFloat(String str) {
        return Float.parseFloat(str);
    }

    public static double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

    public static byte[] stringToByteArr(String str) {
        return str.getBytes();
    }

    //其他一样
    public static String numToString(int num) {
        return String.valueOf(num);
    }

    public static String longToString(long num) {
        return String.valueOf(num);
    }

    public static String byteArrToString(byte[] bytes) {
        return new String(bytes);
    }

}
