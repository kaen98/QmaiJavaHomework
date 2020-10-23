package xuzhiqiang;

import java.util.HashSet;
import java.util.Iterator;

public class questionThree {
    /**
     * 编写一段程序，统计这段文字"This class implements the <tt>Set</tt> interface,
     * backed by a hash table(actually a <tt>HashMap</tt> instance).
     * It makes no guarantees as to the iteration order of the set; in particular,
     * it does not guarantee that the order will remain constant over time.
     * This class permits the <tt>null</tt> element."中不重复字符的数量。
     */
    public static void main(String[] args) {
        String str = "This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element.";
        str = str.toLowerCase();
        str = str.replace(" ", "");
        String[] arr = str.split("");
        HashSet<Object> objects = new HashSet<>();
        int count = 0;
        for (String s : arr) {
            if (!objects.contains(s)) {
                objects.add(s);
                count ++;
            }
        }

        System.out.println("不重复字符的数量是" + count + "个，他们分别是");

        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
