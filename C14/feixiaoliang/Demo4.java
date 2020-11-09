import java.io.*;

/**
 * 编写一个文件复制函数，copyFile(String from, String to)，from为原文件名，to为复制后的新文件名，
 * 复制结束打印所复制的文件大小和用时（毫秒），执行结果如：copy xxx use xxx ms, file size is xxx.
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/11/8 11:49 下午
 */
public class Demo4 {
    public static void main(String[] args){
        long startTime,endTime;
        startTime = System.currentTimeMillis();

        copyFile("d:/study/io/xxx/hello.php", "d:/study/io/xxx/helloBak.php");

        endTime = System.currentTimeMillis();

        System.out.println("复制用时"+(endTime-startTime)+"ms");
    }

    /**
     * 复制文件
     * @param from  源文件
     * @param to    目标文件
     */
    public static void copyFile(String from, String to){
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File fromFile = new File(from);
            if(!fromFile.exists()){
                System.out.println(from+" 文件不存在！");
                return;
            }

            File toFile = new File(to);

            inputStream = new BufferedInputStream(new FileInputStream(fromFile));
            outputStream = new BufferedOutputStream(new FileOutputStream(toFile));
            byte[] buf = new byte[2048];
            int i ;
            while ((i = inputStream.read(buf)) != -1){
                outputStream.write(buf,0,i);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
