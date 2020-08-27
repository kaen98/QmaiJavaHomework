import java.math.BigInteger;

public class BaseConversion {
    //二进制转十进制
    public static int binaryToDecimal(int binaryNumber) {
        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber / 10;
                p++;
            }
        }
        return decimal;
    }

    //十进制转二进制
    public static int decimalToBinary(int n) {
        int t = 0;  //用来记录位数
        int bin = 0; //用来记录最后的二进制数
        int r = 0;  //用来存储余数
        while(n != 0){
             r = n % 2;
             n = n / 2;
            bin = r * Math().pow(10, t);
            t++;
        }
        return bin;
    }

    //二进制转十六进制
    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    //十六进制转换为二进制
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
                    16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    //十进制转十六进制
    public static String HexStrToDecimal(int val){
        return String.format("%08X", val);
    }

    //十六进制转十进制
    public static int decimalToHexStr(String str)
    {
        BigInteger lngNum = new BigInteger(str, 16);
        return lngNum.intValue();
    }

}
