package test03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 编写一段程序，统计这段文字中不重复字符的数量
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        String str = "This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element.";

        char[] chars = str.toCharArray();


        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : chars) {
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                Integer num = map.get(ch);
                num++;
                map.put(ch, num);
            }
        }


        Set<Character> set = map.keySet();

        Iterator<Character> iterator = set.iterator();
        while (iterator.hasNext()) {
            Character key = iterator.next();
            System.out.println("字符：" + key + "出现次数为：" + map.get(key));
        }
    }
}
