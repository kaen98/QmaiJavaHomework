package xuzhiqiang;

import java.io.File;

public class questionTwo {
    /**
     * 编写一段程序，删除d:/study/io这个目录下的大于20Kb的文件。
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
            System.out.println("当前路径目录不存在");
            return ;
        }

        //存在查看是否有子目录
        String[] childs = parent.list();
        if(childs == null || childs.length == 0) {
            System.out.println("当前目录无文件");
            return;
        }
        for(String item : childs) {
            String childPath = filePath + File.separator + item;
            File childFile = new File(childPath);
            if (childFile.isFile()) {
                int size = (int) (childFile.length()/1024);
                if(size > 20){
                    System.out.println("当前文件" + childFile.getName()+"文件大于删除,进行删除");
                    childFile.delete();
                }
            } else {
                fileName(childPath);
            }

        }
        System.out.println("删除目录下大于20kb的文件删除完成");

    }
}
