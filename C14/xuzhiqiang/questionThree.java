package xuzhiqiang;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class questionThree {
    /**
     * 编写一段程序，循环从键盘输入一行字符，把这行字符首尾颠倒后按行输出到一个文件中，遇到quit后退出
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("请输入一行字符串，输入quit退出");
        while ( true) {
            Scanner scanner= new Scanner(System.in);
            String txt = scanner.nextLine();
            if(txt.equals("quit")) {
                System.out.println("结束存入数据");
                break;
            } else {
                writeFile(txt);
            }
        }

    }

    public static void writeFile(String str) {
        //将字符串首尾颠倒，按行输出到一个文件中
        String reverseStr = new StringBuilder(str).reverse().toString();
        String path = "D:\\study";

        //判断当前文件是否存在，不存在添加
        String fileName = "abc.txt"; //文件名及类型
        File file = new File(path, fileName);
        Writer output = null;
        try{
            if(!file.exists()) {
                file.createNewFile();
            }

            //将字符串写入文件
            output = new FileWriter(path + file.separator + fileName, true);
            output.write(reverseStr);
            output.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
