package test03;

import java.io.*;
import java.util.Scanner;

/**
 * 编写一段程序，循环从键盘输入一行字符，把这行字符首尾颠倒后按行输出到一个文件中，遇到quit后退出
 *
 * @author san
 */
public class TestClass {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入字符，如果要退出，请输入 quit:");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String in = scanner.nextLine();
            if ("quit".equals(in)) {
                System.out.println("再见！！");
                return;
            } else {
                FileOutputStream stream = null;
                File file = new File("src/test03/1.txt");
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                        stream = new FileOutputStream(file, true);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    stream = new FileOutputStream(file, true);
                }
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(stream, "UTF-8");
                outputStreamWriter.write(in + "\r\n");
                outputStreamWriter.close();
            }
        }
    }
}
