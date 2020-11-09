package xuzhiqiang;

import java.io.File;

public class questionOne {
    /**
     * 编写一段程序，判断d:/study/io目录是否存在，存在则遍历输出这个目录的所有文件名称，不存在则创建这个目录。
     * @param args
     */
    public static void main(String[] args) {
        String filePath = "D:\\study\\io";
        fileName(filePath);
    }

    public static void fileName(final String filePath) {
        File parent = new File(filePath);
        if (!parent.exists()) {
            //不存创建一个目录
            System.out.println("目录不存在创建目录");
            parent.mkdirs();
            return ;
        }

        System.out.println("\n" + parent.getPath() + "下的文件");
        //存在查看是否有子目录
        String[] childs = parent.list();
        if(childs == null || childs.length == 0) {
            return;
        }
        for(String item : childs) {
            String childPath = filePath + File.separator + item;
            File childFile = new File(childPath);
            if (childFile.isFile()) {
                System.out.println(childFile.getName());
            } else {
                fileName(childPath);
            }

        }

    }
}
