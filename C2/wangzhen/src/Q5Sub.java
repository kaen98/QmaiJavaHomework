public class Q5Sub {
    //二进制转十进制
    public static String binaryToDecimal(String num) {
        return Integer.toString(Integer.parseInt(num, 2), 10);
    }

    //二进制转十六进制
    public static String binaryToHex(String num) {
        return Integer.toHexString(Integer.parseInt(num, 2));
    }

    //十进制转二进制
    public static String decimalToBinary(String num) {
        return Integer.toBinaryString(Integer.parseInt(num, 10));
    }

    //十进制转十六进制
    public static String decimalToHex(String num) {
        return Integer.toHexString(Integer.parseInt(num, 10));
    }

    //十六进制转二进制
    public static String hexToBinary(String num) {
        return Integer.toBinaryString(Integer.parseInt(num, 16));
    }

    //十六进制转十进制
    public static String hexToDecimal(String num) {
        return Integer.toString(Integer.parseInt(num, 16), 10);
    }
}
