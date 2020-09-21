package Q_3;

/**
 * 3. "abcd23abcd34bcd"中，判断该字符串中是否包含"bc"子串。如果包含，求子串的所有出现位置。
 */
public class Q3 {
    public static void main(String[] args) {
        String demo = "abcd23abcd34bcd";

        boolean rst = demo.contains("bc");
        if (rst) {
            int index = 0;
            while(index != -1) {
                index = demo.indexOf("bc", index);
                if (index != -1) {
                    index = index + 1;
                    System.out.println("bc 出现位置：" + index);
                }
            }
        }
    }
}
