import java.util.HashMap;
import java.util.Map;

/**
 * 编写一段程序，统计这段文字"This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element."中不重复字符的数量。
 */
public class Q3 {
    public static void main(String[] args) {
        String sDemo = "This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element.";
        HashMap<String, Integer> sMap = new HashMap<>();
        for (String s : sDemo.split("")) {
            sMap.put(s, sMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(sMap);

        System.out.println("不重复字符:");
        for (Map.Entry<String, Integer> e : sMap.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey() + "=" + e.getValue());
            }
        }
    }
}
