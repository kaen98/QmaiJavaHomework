/**
 * 请写一段示例代码，演示如何在一个方法中捕获多个异常类型。
 */
public class Q1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three:" + a[2]);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
