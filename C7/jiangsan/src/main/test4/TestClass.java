package main.test4;

/**
 * String s = "113@ ere qqq yyui" 请输出所有子串
 *
 * @author san
 */
public class TestClass {
    public static void main(String[] args) {
        String str = "113@ ere qqq yyui";
        String[] strArr = str.split("");

        for (String s : strArr) {
            System.out.println(s);
        }
    }
}
