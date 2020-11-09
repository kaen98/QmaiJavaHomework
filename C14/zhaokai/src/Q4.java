import java.io.*;

/**
 * 编写一个文件复制函数，copyFile(String from, String to)，from为原文件名，to为复制后的新文件名，复制结束打印所复制的文件大小和用时（毫秒），
 * 执行结果如：copy xxx use xxx ms, file size is xxx.
 */
public class Q4 {
    public static void main(String[] args) {
        String from = "./fromQ4.log";
        String to = "./toQ4.log";
        copyFile(from, to);
    }

    public static void copyFile(String from, String to) {
        Reader reader = null;
        Writer writer = null;

        try {
            long start = System.currentTimeMillis();
            reader = new FileReader(from);
            writer = new FileWriter(to, true);

            char[] buf = new char[4096];
            int len = 0;
            while ((len = reader.read(buf)) > 0) {
                String line = new String(buf, 0, len);
//                System.out.println(line);
                writer.write(line);
            }
            long end = System.currentTimeMillis();
            File file = new File(to);
            long timeonsuming = end - start;
            System.out.println("copy '" + from +"' use " + timeonsuming + " ms, file size is " + to.length()+ " byte.");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
