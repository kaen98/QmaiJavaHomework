import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 编写一段程序，循环从键盘输入一行字符，把这行字符首尾颠倒后按行输出到一个文件中，遇到quit后退出。
 */
public class Q3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String filePath = "./Q3.log";
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(filePath, true);

        try {
            while (!line.equals("quit")) {
//            System.out.println("input:" + line);
                fw.write(line + System.lineSeparator());
                line = scanner.nextLine();
            }
        } finally {
            scanner.close();
            fw.close();
        }

        System.out.println("quit ok");
    }
}
