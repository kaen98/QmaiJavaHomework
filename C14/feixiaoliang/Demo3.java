import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * 编写一段程序，循环从键盘输入一行字符，把这行字符首尾颠倒后按行输出到一个文件中，遇到quit后退出。
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/11/8 11:49 下午
 */
public class Demo3 {
    public static void main(String[] args){

        while (true){
            System.out.println("输入内容，如要退出请输入quit");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();

            if(Objects.equals(str, "quit")){
                break;
            }

            //字符颠倒
            String reverse = new StringBuffer(str).reverse().toString();

            writerFile("1.txt", reverse+System.getProperty("line.separator"));
        }

    }

    /**
     * 给某个文件写入内容
     * @param path  文件路径
     * @param data  内容
     */
    public static void writerFile(String path, String data){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            fileWriter.write(data);
            fileWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
