package main.test2;

/**
 * 编写程序将 “jdk” 全部变为大写,然后截取子串”DK”
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        String str = "jdk";
        String newStr = str.toUpperCase();
        System.out.println(newStr.substring(1));
    }
}
