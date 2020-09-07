/**
 * 对于finally语句段中的代码一定会执行吗？请编写一段程序进行验证。
 * 答： 会执行； 发生异常也会执行
 */
public class Q3 {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three:" + a[2]);
        } finally {
            System.out.println("finally");
        }
    }
}
