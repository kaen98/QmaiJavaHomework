package Q_4;

/**
 * 4. String s = "113@ ere qqq yyui" 请输出所有子串
 * 113
 * ere
 * qqq
 * yyui
 *
 */
public class Q4 {
    public static void main(String[] args) {
        String s = "113@ ere qqq yyui";

        s = s.replace("@", "");

        String[] list = s.split(" ");

        for(String subString : list)
        {
            System.out.println(subString);
        }
    }
}
