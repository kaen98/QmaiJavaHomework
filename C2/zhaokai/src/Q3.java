import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        String s = "123";

        int stringToInt = Util.stringToInt(s);
        long stringToLong = Util.stringToLong(s);
        float stringToFloat = Util.stringToFloat(s);
        double stringToDouble = Util.stringToDouble(s);
        byte[] stringToByteArray = Util.stringToByteArray(s);

        System.out.println(stringToInt);
        System.out.println(stringToLong);
        System.out.println(stringToFloat);
        System.out.println(stringToDouble);
        System.out.println(Arrays.toString(stringToByteArray));


        String byteArrayToString = Util.byteArrayToString(stringToByteArray);
        System.out.println(byteArrayToString);


        String intToString = Util.intToString(stringToInt);
        System.out.println(intToString);

    }
}



