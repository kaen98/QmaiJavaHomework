package C11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Q3 {
    public static void main(String[] args) {
        /**
         * 3. 如何在字符串中找到第一个不重复的字符(使用Java集合框架)
         * 字符串： yellow
         */
        String str = "yellow";
        List<String> l = new ArrayList<>();
        for(int i=0;i < str.length();i++) {
            l.add(str.substring(i,i+1));
        }
        for(int i=0;i < str.length();i++) {
           if (Collections.frequency(l, str.substring(i,i+1)) ==1){
               System.out.println(str.substring(i,i+1));
               break;
           }
        }
    }

}
