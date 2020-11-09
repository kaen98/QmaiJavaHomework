import java.io.File;

/**
 * 编写一段程序，删除d:/study/io这个目录下的大于20Kb的文件
 */
public class Q2 {
    private static int fileSize = 20 * 1024;

    public static void main(String[] args) {
        String filePath = "./study/io";
        printFiles(filePath, 1);
    }

    public static void printFiles(String filePath, int level) {
        File file = new File(filePath);

        if (level == 1 && !file.exists()) {
            file.mkdirs();
            System.out.println(filePath + ", 目录不存在， 已创建");
            return;
        }

        String levelString = String.format("%0" + level + "d", 0).replace("0", " ");
        if (file.isDirectory()) {
            System.out.println(levelString + "=>" + filePath);
        }
        if (file.isFile()) {
            System.out.println(levelString + "--" + filePath + "; Size:" + file.length());
            if (file.length() > fileSize) {
                file.delete();
            }
        }

        String[] list = file.list();
        if (list == null || list.length == 0) {
            return;
        }
        level = level + 1;
        for (String fp : list) {
            printFiles(filePath + File.separator + fp, level);
        }
    }
}
