package C14;

import java.io.File;

class Q2 {
    public static void main(String[] args) {
        //编写一段程序，删除d:/study/io这个目录下的大于20Kb的文件。
        System.out.println(delListFiles("D:/study/io"));;
    }

    public static int delListFiles(final String path) {
        int num = 0;
        File parent = new File(path);
        if (!parent.exists()) {
            return num;
        }
        String[] childs = parent.list();
        if (childs == null || childs.length == 0) {
            return num;
        }
        for(String item :childs) {
            String  childPath = path + File.separator + item;
            File child = new File(childPath);
            if (child.isFile()){
                if (child.length() > 1024*20) {
                    System.out.println(childPath);
                    num +=1;
                    child.delete();
                }
            }
        }
        return num;
    }
}