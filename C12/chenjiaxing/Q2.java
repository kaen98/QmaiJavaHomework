package C12;

import java.util.*;

class Q2 {
    public static void main(String[] args) {
        /**
         * 针对上面那段文字，删除并打印输出按自然排序的第一个字符和最后一个字符。
         */
        Set<String> str = new HashSet<>();
        str.add("一");
        str.add("站");
        str.add("式");
        str.add("门");
        str.add("店");
        str.add("运");
        str.add("营");
        str.add("服");
        str.add("务");
        str.add("平");
        str.add("台");

        str.remove("门");
        str.remove("店");
        int num = 0;
        int size = str.size();
        Iterator<String> iterator = str.iterator();
        while(iterator.hasNext()) {
            String i = iterator.next();

            if (num == 0) {
                System.out.println(i);
                iterator.remove();
            } else if(num == (size -1)) {
                System.out.println(i);
                iterator.remove();
            }
            num++;

        }
    }
}
