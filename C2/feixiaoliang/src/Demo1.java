/**
 * byte、int 与 二进制 互转，先将byte的127、128、-128、-128转二进制，再将这些二进制转int
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/22 9:56 下午
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] numList = {127, -127, 128, -128};

        //循环处理
        for (int num : numList) {
            //byte数据
            byte byteNum = (byte) num;

            //二进制数据
            String stringNum = Demo1.decimalToBinary(byteNum);

            //转换成int
            int intNum = Demo1.binaryToDecimal(stringNum);

            System.out.println("byte:" + byteNum + "    二进制:" + stringNum + "    十进制:" + intNum);
        }
    }

    /**
     * 转成二进制
     *
     * @param num 十进制数字
     * @return 转换成二进制
     */
    public static String decimalToBinary(byte num) {
        //强转int类型
        int intNum = (int) num;
        String binaryNum = "";
        String prefix = intNum < 0 ? "-" : "";
        intNum = Math.abs(intNum);
        while (intNum != 0) {
            int b = intNum % 2;
            intNum /= 2;
            binaryNum = b + binaryNum;
        }

        return prefix + binaryNum;
    }

    /**
     * 转成十进制
     *
     * @param num
     * @return
     */
    public static int binaryToDecimal(String num) {
        //十进制数变量、二进制位数
        int decimalNum = 0, length = num.length();
        //用于判断符号位
        int a = Integer.parseInt(num);
        int b = 0;

        for (int i = length - 1; i >= 0; i--) {
            char digits = num.charAt(b);
            int digitsInt = digits - '0';
            int pow = num.charAt(length - 1) == '-' ? i - 1 : i;

            b++;
            if (digits == '-') {
                continue;
            }

            decimalNum += digitsInt * Math.pow(2, pow);
        }

        return a < 0 ? 0 - decimalNum : decimalNum;
    }
}
