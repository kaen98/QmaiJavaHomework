import org.omg.CORBA.PUBLIC_MEMBER;

import java.nio.charset.StandardCharsets;

public class Util {
    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }

    public static long stringToLong(String s) {
        return Long.parseLong(s);
    }

    public static float stringToFloat(String s) {
        return Float.parseFloat(s);
    }

    public static double stringToDouble(String s) {
        return Double.parseDouble(s);
    }

    public static byte[] stringToByteArray(String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }

    public static String byteArrayToString(byte[] byteArray) {
        return new String(byteArray, StandardCharsets.UTF_8);
    }

    public static String intToString(int i) {
        return String.valueOf(i);
    }

    public static String charToASCII(char c) {
        String cc = Integer.toHexString(c | 0x10000);
        String ccc = cc.substring(1);
        return "\\u" + ccc;
    }

    public static char ASCIIToChar(int asscii) {
        return (char) asscii;
    }

    // 二进制， 转十进制
    public static String BinaryToDecimal(String b) {
        int i = Integer.parseInt(b, 2);
        return Integer.toString(i, 10);
    }

    // 二进制， 转十六进制
    public static String BinaryToHex(String b) {
        int i = Integer.parseInt(b, 2);
        return Integer.toString(i, 16);
    }

    // 十进制， 转二进制
    public static String DecimalToBinary(String d) {
        int i = Integer.parseInt(d, 10);
        return Integer.toString(i, 2);
    }


    // 十进制， 转十六进制
    public static String DecimalToHex(String d) {
        int i = Integer.parseInt(d, 10);
        return Integer.toString(i, 16);
    }

    // 十六进制， 转二进制
    public static String HexToBinary(String d) {
        int i = Integer.parseInt(d, 16);
        return Integer.toString(i, 2);
    }

    // 十六进制， 转十进制
    public static String HexToDecimal(String d) {
        int i = Integer.parseInt(d, 16);
        return Integer.toString(i, 10);
    }
}
