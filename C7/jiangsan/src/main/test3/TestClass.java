package main.test3;

/**
 * "abcd23abcd34bcd"中，判断该字符串中是否包含"bc"子串。如果包含，求子串的所有出现位置。
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        String str = "abcd23abcd34bcd";
        String findStr = "bc";
        int index = str.indexOf(findStr);
        while (index != -1) {
            System.out.println(index);
            index = str.indexOf(findStr, index + 1);
        }
    }
}
