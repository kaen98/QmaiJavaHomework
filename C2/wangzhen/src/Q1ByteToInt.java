public class Q1ByteToInt {

    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte) 128;
        byte c = -128;

        /*转二进制*/
        String A = Integer.toBinaryString(a);

        System.out.println("byte val :" + a);
        System.out.println("Binary val :" + A);
        System.out.println("Int val :" + Integer.parseInt(A, 2));

        String B = Integer.toBinaryString(b);

        System.out.println("byte val :" + b);
        System.out.println("Binary val :" + B);
        //超出了int
        System.out.println("Int val : " + (int) Long.parseLong(B, 2));
//        System.out.println("Int val :" + Integer.parseInt(B.trim(), 2));

        String C = Integer.toBinaryString(c);

        System.out.println("byte val :" + c);
        System.out.println("Binary val :" + C);
        System.out.println("Int val :" +  (int) Long.parseLong(B, 2));
    }

}
