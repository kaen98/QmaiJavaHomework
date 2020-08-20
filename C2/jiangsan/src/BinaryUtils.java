/**
 * byte、int 与 二进制 互转，先将byte的127、128、-128、-128转二进制，再将这些二进制转int
 *
 * @author San
 */
public class BinaryUtils {

    public int binary2Num(int binary) {
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

    public int num2Binary(int num) {
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

    public static void main(String[] args) {
        BinaryUtils utils = new BinaryUtils();
        System.out.println(utils.num2Binary(127));//1111111
        System.out.println(utils.num2Binary(128));//10000000
        System.out.println(utils.num2Binary(-128));//-10000000

        System.out.println(utils.binary2Num(1111111));
        System.out.println(utils.binary2Num(10000000));
        System.out.println(utils.binary2Num(-10000000));
    }
}
