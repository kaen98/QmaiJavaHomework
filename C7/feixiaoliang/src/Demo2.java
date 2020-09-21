/**
 * 编写程序将 “jdk” 全部变为大写,然后截取子串”DK”
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/21 1:50 上午
 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "jdk";
        //转换大写
        String strUpper = str.toUpperCase();
        //替换DK
        System.out.println(strUpper.replace("DK", ""));
    }
}
