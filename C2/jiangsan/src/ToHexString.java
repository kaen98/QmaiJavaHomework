/**
 * 实现二进制、十进制、十六进制互转
 *
 * @author San
 */
public class ToHexString {

    //二进制转十进制
    public static int binaryToString(int binary) {
        int decimal = 0;
        int p = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, p);
                binary = binary / 10;
                p++;
            }
        }

        return decimal;
    }

    //十进制转二进制
    public static int stringToBinary(int num) {
        int a;
        int bin = 0;
        int i = 0;

        while (num != 0) {
            a = num % 2;
            num = num / 2;
            bin += a * (Math.pow(10, i));
            i++;
        }

        return bin;
    }

    //二进制转十六进制
    public static String binaryToHexString(int num) {
        int i = Integer.parseInt(String.valueOf(num), 2);

        return Integer.toHexString(i);
    }

    //十六进制转二进制
    public static String hexStringToBinary(String hexStr) {

        int hex = Integer.parseInt(String.valueOf(hexStr), 16);

        return Integer.toBinaryString(hex);
    }

    public static void main(String[] args) {
        //System.out.println("十进制转二进制结果:" + binaryToString(1001));
        //System.out.println("十进制转二进制结果:" + stringToBinary(1001));

        System.out.println("二进制转十六进制结果:" + binaryToHexString(1111101001));
        System.out.println("十六进制转二进制结果:" + hexStringToBinary("3e9"));

    }
}
