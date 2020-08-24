public class ByteIntoBinary {
    //byte 转 二进制
    public static String byteToBinary(byte i) {
        String binary;
        binary = Integer.toBinaryString((i & 0xFF) + 0x100).substring(1);
        return binary;
    }

    //二进制转int
    public static int binaryToInt(String str) {
        int m;
        m = Integer.parseInt(str,2);
        return m;
    }

    public static void main(String[] str) {
//        127、128、-128、-128转二进制，再将这些二进制转int
        ByteIntoBinary unit = new ByteIntoBinary();
        System.out.println(unit.byteToBinary((byte)127));     //01111111
        System.out.println(unit.byteToBinary((byte) 128));    //10000000
        System.out.println(unit.byteToBinary((byte)-128));    //10000000
        System.out.println(unit.byteToBinary((byte)-127));    //10000000

        System.out.println(unit.binaryToInt("01111111"));     //01111111
        System.out.println(unit.binaryToInt("10000000"));    //10000000
        System.out.println(unit.binaryToInt("-10000000"));    //10000000

    }
}
