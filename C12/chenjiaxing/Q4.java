package C12;

import java.util.*;

class Q4 {
    public static void main(String[] args) {
        /**
         * 编写一段程序，统计这段文字"This class offers constant time performance for the basic operations add remove contains and size"中不重复词语的数量，并按序列打印输出。
         */
        String str = "This class offers constant time performance for the basic operations add remove contains and size";
        HashSet<String> str1 = new HashSet<>();
        String[] s = str.split(" ");
        for(String i : s) {
            str1.add(i);
        }
        System.out.println(str1.size());
    }
}

