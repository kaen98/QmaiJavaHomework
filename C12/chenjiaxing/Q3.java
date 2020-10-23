package C12;

import java.util.*;

class Q3 {
    public static void main(String[] args) {
        /**
         * 编写一段程序，统计这段文字"This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element."中不重复字符的数量。
         */
        String str = "This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element.";
        HashSet<String> str1 = new HashSet<>();
        for(int i=0;i < str.length();i++) {
            str1.add(str.substring(i,i+1));
        }
        System.out.println(str1.size());
    }

}
