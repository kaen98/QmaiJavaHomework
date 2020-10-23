package C12;

import java.text.SimpleDateFormat;
import java.util.*;

class Q1 {
    public static void main(String[] args) {
        /**
         * 编写一段程序，把"一站式门店运营服务平台"按单字符添加到HashSet中后，再删除"门店"两个字符，最后循环打印输出每一个字符。
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

        for(String i : str){
            System.out.println(i);
        }
    }
}
