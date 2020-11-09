package test01;

import java.io.File;

/**
 * 编写一段程序，判断d:/study/io目录是否存在，存在则遍历输出这个目录的所有文件名称，不存在则创建这个目录
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        String path = "src/test01/study/io";
        listFile(path);
    }

    public static void listFile(final String path) {
        File file = new File(path);
        System.out.println(file.exists());
        String[] children = file.list();
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        if (children == null || children.length == 0) {
            return;
        }

        System.out.println(path + "下的文件列表：");

        for (String item : children) {
            String childPath = path + File.separator + item;
            System.out.println(childPath);
            File childFile = new File(childPath);

            if (childFile.isFile()) {
                System.out.println(childFile.getName() + "\t" + childFile.length() + 'b');
            } else {
                listFile(childPath);
            }
        }
    }
}
