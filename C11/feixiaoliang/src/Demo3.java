/**
 * 如何在字符串中找到第一个不重复的字符(使用Java集合框架)
 * 字符串： yellow
 *
 * @author fei <xliang.fei@gmail.com>
 */
public class Demo3 {
    public static void main(String[] args) {
        String str = "yellow";
        char[] strArray = str.toCharArray();
        int strLength = strArray.length;
        for (char s : strArray) {
            String replaceStr = str.replace(String.valueOf(s), "");
            int replaceLength = replaceStr.length();
            if (strLength - replaceLength == 1) {
                System.out.println("第一个不重复的字符" + s);
                break;
            }
        }
    }
}
