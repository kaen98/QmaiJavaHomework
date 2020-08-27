public class Q5BinaryDecimalHex {
    public static void main(String[] args) {

        String originBinary = "10000";
        String originDecimal = "16";
        String originHex = "10";

        System.out.println("originBinary:" + originBinary);
        System.out.println("originDecimal:" + originDecimal);
        System.out.println("originHex:" + originHex);
        System.out.println("二进制转十进制:" + Q5Sub.binaryToDecimal(originBinary));
        System.out.println("二进制转十六进制:" + Q5Sub.binaryToHex(originBinary));
        System.out.println("十进制转二进制:" + Q5Sub.decimalToBinary(originDecimal));
        System.out.println("十进制转十六进制:" + Q5Sub.decimalToHex(originDecimal));
        System.out.println("十六进制转二进制:" + Q5Sub.hexToBinary(originHex));
        System.out.println("十六进制转十进制:" + Q5Sub.hexToDecimal(originHex));
    }
}
