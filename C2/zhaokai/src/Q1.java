public class Q1 {
    public static void main(String[] args) {
        int[] intList = {127, 128, -128, -129};

        for (int i : intList) {
            // byte数据
            byte b = (byte)i;
            // 二进制数据
            String s = Integer.toBinaryString(b);

            System.out.println(i);
            System.out.println(" => (byte)" + b);
            System.out.println(" => (Binary)" + s);
            System.out.println(" => (Int)" + Integer.parseInt(s, 2));
            System.out.println();
        }
    }
}
