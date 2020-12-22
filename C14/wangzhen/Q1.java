package C14;

import java.io.File;

/**
 * //编写一段程序，判断d:/study/io目录是否存在，存在则遍历输出这个目录的所有文件名称，不存在则创建这个目录
 */
class Q1 {
    public static void main(String[] args) {
        listFiles("D:/study/io");
    }
    public static void listFiles(final String path) {
        File parent = new File(path);
        if (!parent.exists()) {
            System.out.println(parent.mkdirs());
            return;
        }
        String[] childs = parent.list();
        if (childs == null || childs.length == 0) {
            return;
        }
        System.out.println("\n" + parent.getPath() +"下的文件");
        for(String item :childs) {
            String  childPath = path + File.separator + item;
            File child = new File(childPath);
            if (child.isFile()){
                System.out.println(child.getName()+"\t"+child.length()+"b");
            }
        }


    }
}