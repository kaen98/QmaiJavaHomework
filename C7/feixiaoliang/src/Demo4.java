import java.util.ArrayList;

/**
 * String s = "113@ ere qqq yyui" 请输出所有子串
 * 113
 * ere
 * qqq
 * yyui
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/21 1:51 上午
 */
public class Demo4 {
    public static void main(String[] args) {

        //第一种方法
        String s = "113@ ere qqq yyui";
        System.out.println(explode(" ", s));

        //第二种方法
        String[] strArray = s.split(" ");
        for (String st:strArray) {
            System.out.println(st);
        }
    }

    /**
     * 使用一个字符串分割另一个字符串
     * @param searchStr 边界上的分隔字符
     * @param string 输入的字符串
     * @return 返回数组
     */
    public static ArrayList<String> explode(String searchStr, String string) {
        //次数
        int count = 0;
        //结束位置
        int endIndex = 0;
        //开始位置
        int beginIndex = 0;

        ArrayList<String> lists = new ArrayList();

        while ((endIndex = string.indexOf(searchStr, endIndex)) != -1) {
            endIndex = endIndex + searchStr.length();
            lists.add(string.substring(beginIndex, endIndex - 1));
            beginIndex = endIndex;
        }

        return lists;
    }
}
