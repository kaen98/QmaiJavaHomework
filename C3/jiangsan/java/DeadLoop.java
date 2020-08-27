/**
 * 写一段死循环程序代码，30s后跳出循环
 *
 * @author San
 */
public class DeadLoop {

    public static long startTime = System.currentTimeMillis();
    public static long stopTime = 10 * 1000;

    public static void main(String[] args) {
        while (true) {
            System.out.println("无知的人类~");

            long nowTime = System.currentTimeMillis();

            if ((nowTime - startTime) > stopTime) {
                break;
            }
        }
    }
}
