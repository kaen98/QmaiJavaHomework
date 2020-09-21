import java.util.ArrayList;
import java.util.List;

/**
 * "abcd23abcd34bcd"中，判断该字符串中是否包含"bc"子串。如果包含，求子串的所有出现位置。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/21 1:51 上午
 */
public class Demo3 {
    public static void main(String[] args) {
        String string = "abcd23abcd34bcd";
        String searchStr = "bc";
        StringBuilder outString = new StringBuilder("'" + searchStr + "'字符在'" + string + "'出现的位置有：");

        int index = 0;

        ArrayList<Integer> lists = new ArrayList();

        while ((index = string.indexOf(searchStr, index)) != -1) {
            index = index + searchStr.length();

            lists.add(index);
        }

        for (Integer list : lists) {
            outString.append(list).append("、");
        }

        outString.deleteCharAt(outString.length() - 1);

        System.out.println(outString);
    }
}
