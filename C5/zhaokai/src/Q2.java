/**
 * 捕获异常代码块中，只有try/finally语句而没有catch语句是否可以，请编写一段函数加以验证。
 * 答： 可以
 */
public class Q2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element two:" + a[1]);
        } finally {
            System.out.println("finally");
        }
    }
}
