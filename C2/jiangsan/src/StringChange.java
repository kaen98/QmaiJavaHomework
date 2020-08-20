import java.util.Arrays;

/**
 * 实现类型转换，String 转 (int、long、float、double、byte[])，(byte[]、int) 转 String
 *
 * @author San
 */
public class StringChange {

    public static int string2Int(String str) {
        return Integer.parseInt(str);
    }

    public static long string2Long(String str) {
        return Long.parseLong(str);
    }

    public static float string2Float(String str) {
        return Float.parseFloat(str);
    }

    public static double string2Double(String str) {
        return Double.parseDouble(str);
    }

    public static byte[] string2ByteArr(String str) {
        return str.getBytes();
    }

    public static String decimal2String(int mun) {
        return String.valueOf(mun);
    }

    public static String byteArr2String(byte[] bytes) {
        return new String(bytes);
    }


    public static void main(String[] args) {

        String str = "11221212";
        byte[] bytes = {1, 2, 3};

        System.out.println("1===" + string2Int(str));
        System.out.println("2===" + string2Long(str));
        System.out.println("3===" + string2Float(str));
        System.out.println("4===" + string2Double(str));
        System.out.println("5===" + Arrays.toString(string2ByteArr(str)));
        System.out.println("6===" + decimal2String(6));
        System.out.println("7===" + byteArr2String(bytes));
    }

}
