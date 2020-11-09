import java.io.File;

/**
 * 编写一段程序，删除d:/study/io这个目录下的大于20Kb的文件。
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/11/8 11:48 下午
 */
public class Demo2 {
    public static void main(String[] args){
        String path = "./d:/study/io";
        fileList(path);
    }

    public static void fileList(String path){
        File file = new File(path);

        //没有则创建目录
        if(!file.exists()){
            System.out.println(path+" 目录不存在");
            file.mkdirs();
        }else{
            //遍历这个目录所有文件名称
            String[] childs = file.list();

            if(childs == null || childs.length == 0){
                return;
            }

            for (String child:childs) {
                String childPath = path + File.separator + child;
                File childFile = new File(childPath);
                if(childFile.isFile()){
                    int size = (int) (childFile.length()/1024);
                    if(size > 20){
                        System.out.println(childFile.getName()+"文件大于20kb，需要删除");
                        childFile.delete();
                    }
                }else {
                    fileList(childPath);
                }
            }
        }

    }
}
