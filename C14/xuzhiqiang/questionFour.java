package xuzhiqiang;

import java.io.*;

public class questionFour {
    /**
     * 编写一个文件复制函数，copyFile(String from, String to)，from为原文件名，to为复制后的新文件名，
     * 复制结束打印所复制的文件大小和用时（毫秒），执行结果如：copy xxx use xxx ms, file size is xxx
     * @param args
     */
    public static void main(String[] args) {
        String fromPath = "D:\\study\\abc.txt";
        String toPath = "D:\\study\\bcd.txt";
        copyFile(fromPath, toPath);
    }

    public static void copyFile(String from, String to) {
        //记录当前时间
        long startTime = System.currentTimeMillis();
        InputStream   input = null;
        OutputStream  output = null;
        File fromfile = new File(from);
        File tofile = new File(to);

        try {
            input = new BufferedInputStream(new FileInputStream(fromfile));
            output = new BufferedOutputStream(new FileOutputStream(tofile));
            byte[] buf = new byte[4096];
            int len = 0;
            while ((len = input.read(buf)) > 0) {
                output.write(buf,0, len);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("copy "+ from + " use " + (endTime - startTime)+ " file size is " + to.length());
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
