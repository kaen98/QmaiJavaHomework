public class Q5 {
    public static void main(String[] args) {
        System.out.println("二进制， 转十， 转十六");
        String b = "10000";
        String BinaryToDecimal = Util.BinaryToDecimal(b);
        System.out.println(b + "=> (BinaryToDecimal) " + BinaryToDecimal);
        String BinaryToHex = Util.BinaryToHex(b);
        System.out.println(b + "=> (BinaryToHex) " + BinaryToHex);
        System.out.println();


        System.out.println("十进制， 转二， 转十六");
        String d = "16";
        String DecimalToBinary = Util.DecimalToBinary(d);
        System.out.println(d + "=> (DecimalToBinary) " + DecimalToBinary);
        String DecimalToHex = Util.DecimalToHex(d);
        System.out.println(d + "=> (DecimalToHex) " + DecimalToHex);
        System.out.println();

        System.out.println("十六进制， 转二， 转十");
        String h = "10";
        String HexToBinary = Util.HexToBinary(h);
        System.out.println(h + "=> (HexToBinary) " + HexToBinary);
        String HexToDecimal = Util.HexToDecimal(h);
        System.out.println(h + "=> (HexToDecimal) " + HexToDecimal);
        System.out.println();

    }
}
