import java.util.Arrays;

public class Q3StringTo {
    public static void main(String[] args) {
        String str = "6666";
        byte[] strByteArr = Q3Sub.stringToByteArr(str);

        System.out.println("origin:" + str);
        System.out.println("stringToInt:" + Q3Sub.stringToInt(str));
        System.out.println("stringToLong:" + Q3Sub.stringToLong(str));
        System.out.println("stringToFloat:" + Q3Sub.stringToFloat(str));
        System.out.println("stringToFloat:" + Q3Sub.stringToFloat(str));
        System.out.println("stringToDouble:" + Q3Sub.stringToDouble(str));
        System.out.println("stringToByteArr:" + Arrays.toString(strByteArr));
        System.out.println("numToString:" + Q3Sub.numToString(666));
        System.out.println("byteArrToString:" + Q3Sub.byteArrToString(strByteArr));
    }
}
