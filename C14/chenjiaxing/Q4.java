package C14;

import java.io.*;
import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        System.out.println(copyFile("D:/study/io/scan.txt", "D:/study/io/a/sc.txt"));;
    }
    //编写一个文件复制函数，copyFile(String from, String to)，from为原文件名，to为复制后的新文件名，复制结束打印所复制的文件大小和用时（毫秒），执行结果如：copy xxx use xxx ms, file size is xxx.
    public static boolean copyFile(String from,String to) {
        long timestamp = System.currentTimeMillis() / 1000L;
        File from_file = new File(from);
        InputStream from_input = null;
        if (from_file.isFile()) {
            try{
                 from_input = new FileInputStream(from);
                byte[] buf = new byte[4096];
                int len = 0;
                String line = "";
                while ((len = from_input.read(buf)) >0) {
                    line = new String(buf, 0, len);
                }
                boolean b = fileSave(to, line);
                if (b == false) {
                    return false;
                }
                long end_timestamp = System.currentTimeMillis() / 1000L;
                long ms = timestamp - end_timestamp;
                System.out.println("copy "+from+" use "+to+ " "+ms + " ms, file size is "+from_file.length()+"b.");
                return true;
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
        return  false;
    }

    public static boolean fileSave(String path, String text){
        try{
            File file =new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            //使用true，即进行append file
            FileWriter fileWritter = new FileWriter(path,true);
            fileWritter.write(text);
            fileWritter.close();
            return true;
        }catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }
}