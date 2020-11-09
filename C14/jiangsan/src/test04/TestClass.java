package test04;

import java.io.*;

/**
 * 编写一个文件复制函数，copyFile(String from, String to)，
 * from为原文件名，to为复制后的新文件名，复制结束打印所复制的文件大小和用时（毫秒），执行结果如：copy xxx use xxx ms, file size is xxx.
 *
 * @author san
 */
public class TestClass {
    public static void main(String[] args) {
        String from = "src/test04/from/1.txt";
        String to = "src/test04/to/2.txt";
        copyFile(from, to);
    }

    private static void copyFile(String from, String to) {
        long time1 = System.currentTimeMillis();
        File fromFile = new File(from);
        File toFile = new File(to);
        if (!fromFile.exists()) {
            System.out.println("源文件不存在");
            return;
        }

        if (toFile.exists()) {
            System.out.println("目标文件已存在");
        }

        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(from));
            byte[] buf = new byte[4096];
            int len = 0;

            FileOutputStream stream = null;
            //创建文件
            toFile.createNewFile();
            stream = new FileOutputStream(toFile, true);
            OutputStreamWriter streamWriter = new OutputStreamWriter(stream, "UTF-8");
            while ((len = bufferedInputStream.read(buf)) > 0) {
                String line = new String(buf, 0, len);
                streamWriter.write(line);
            }
            streamWriter.close();
            long time2 = System.currentTimeMillis();
            System.out.println("copy " + from + " use " + (time2 - time1) + " ms, file size is " + fromFile.length() + "b");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
