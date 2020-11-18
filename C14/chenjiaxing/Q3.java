package C14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        //编写一段程序，循环从键盘输入一行字符，把这行字符首尾颠倒后按行输出到一个文件中，遇到quit后退出。
        Scanner s = new Scanner(System.in);
        while (true){
            String line = s.nextLine();
            if (line.equals("quit")) {
                return ;
            }
            String content = "";
            for(int i=line.length()-1;i>=0;i--){
                content += line.charAt(i);
            }

            try{
                File file =new File("D:/study/io/scannerText.txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                //使用true，即进行append file
                FileWriter fileWritter = new FileWriter("D:/study/io/scannerText.txt",true);
                System.out.println(file.getName()+"文件写入" + content);
                fileWritter.write(content);
                fileWritter.close();
                System.out.println("finish");
            }catch(IOException e){
                e.printStackTrace();
            }

            System.out.println(line);
        }

       // s.close();
    }
}