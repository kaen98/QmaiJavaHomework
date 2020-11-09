package test02;

import java.io.File;

/**
 * 删除d:/study/io这个目录下的大于20Kb的文件
 *
 * @author san
 */
public class TestClass {
    public static void main(String[] args) {
        String path = "src/test02/study/io";
        delFile(path);
    }

    private static void delFile(final String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }

        String[] children = file.list();
        for (String item : children) {
            File file1 = new File(path + File.separator + item);
            if (file1.isFile()) {
                if (file1.length() > 20) {
                    System.out.println(file1.getName() + "大于20k,现在模拟删除它 file1.delete()");
                }
            } else {
                return;
            }
        }
    }
}
