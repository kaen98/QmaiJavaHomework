package C11;

import java.util.*;

class Q1 {
    public static void main(String[] args) {
        /**
         * 1. 统计每个单词出现的次数
         * 有如下字符串"If you want to change your life I think you must come to learn English"(用空格间隔)
         * 打印格式：
         * to=3
         * think=1
         * you=2
         */
        String s = "If you want to change your life I think you must come to learn English";

        String[] str = s.split(" ");
        HashMap<String, Integer> e = new HashMap<>();
        for(String i : str) {
            Integer x = e.get(i);
            if (x == null) {
                x = 1;
            } else {
                x+=1;
            }
            e.put(i, x);
        }
        Set<Map.Entry<String, Integer>> entrySet = e.entrySet();
        for(Map.Entry<String, Integer> ent : entrySet){
            System.out.println(ent.getKey()+"="+ent.getValue());
        }
    }
}
