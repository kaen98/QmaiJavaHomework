package demo1;

import java.util.Scanner;

/**
 * 请写一段示例代码，演示如何在一个方法中捕获多个异常类型。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/6 12:57 上午
 */
public class Demo1 {
    public static void main(String[] args) {

        System.out.println("请输入数字");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        try {
            switch (input) {
                case "1":
                    throw new RuntimeException("运行错误RuntimeException");
                default:
                    throw new Exception("运行错误Exception");
            }
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
