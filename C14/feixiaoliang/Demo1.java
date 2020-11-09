import java.io.File;

/**
 * 编写一段程序，判断d:/study/io目录是否存在，存在则遍历输出这个目录的所有文件名称，不存在则创建这个目录。
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/11/8 11:42 下午
 */
public class Demo1 {
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
                    System.out.println("文件名："+childFile.getName()+" 文件大小："+childFile.length());
                }else {
                    fileList(childPath);
                }
            }
        }

    }
}
