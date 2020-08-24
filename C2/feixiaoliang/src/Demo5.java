/**
 * 实现二进制、十进制、十六进制互转
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/23 10:06 下午
 */
public class Demo5 {
    public static void main(String[] args) {
        String s = "1111011";
        System.out.println(Demo5.decimalConversion(s, 2));
    }

    /**
     * 二、十、十六进制转换
     *
     * @param num   数字
     * @param radix 几进制
     * @return 返回转换的字符
     */
    public static String decimalConversion(String num, int radix) {
        String s = "";

        int number;

        switch (radix) {
            case 2:
                s = "二进制数:" + num + "\n";

                number = Integer.valueOf(num, radix);

                //二进制转十进制
                s += "转换成十进制：" + number + "\n";

                //十进制转十六进制
                s += "转换成十六进制：" + Integer.toHexString(number);
                break;
            case 10:
                s = "十进制数:" + num + "\n";

                //十进制转二进制
                s += "十进制转换成二进制：" + Integer.toBinaryString(Integer.parseInt(num)) + "\n";

                //十进制转十六进制
                s += "十进制转换成十六进制：" + Integer.toHexString(Integer.parseInt(num));
                break;
            case 16:
                s = "十六进制数:" + num + "\n";

                //十六进转换成十进制
                number = Integer.valueOf(num, radix);

                //十六进制转二进制
                s += "十六进制转换成二进制：" + Integer.toBinaryString(number) + "\n";

                //十六制转十进制
                s += "十六进制转换成十进制：" + number;
                break;
            default:
                s = "数字错误";
                break;
        }

        return s;
    }
}
