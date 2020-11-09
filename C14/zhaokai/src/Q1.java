import java.io.File;

/**
 * 编写一段程序，判断d:/study/io目录是否存在，存在则遍历输出这个目录的所有文件名称，不存在则创建这个目录。
 */
public class Q1 {

    public static void main(String[] args) {
        String filePath = "./study/io";
        printFiles(filePath, filePath, 1);
    }


    public static void printFiles(String filePath, String fileName, int level) {
        File file = new File(filePath);

        if (level == 1 && !file.exists()) {
            file.mkdirs();
            System.out.println(filePath + ", 目录不存在， 已创建");
            return;
        }
        String levelString = String.format("%0" + level + "d", 0).replace("0", " ");
        if (file.isDirectory()) {
            System.out.println(levelString + "=>" + fileName);
        }
        if (file.isFile()) {
            System.out.println(levelString + "--" + fileName);
        }

        String[] list = file.list();
        if (list == null || list.length == 0) {
            return;
        }
        level = level + 1;
        for (String fp : list) {
            printFiles(filePath + File.separator + fp, fp, level);
        }
    }
}
