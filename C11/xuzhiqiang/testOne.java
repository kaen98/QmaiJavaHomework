package xuzhiqiang;

import java.util.Map.Entry;
import java.util.TreeMap;

public class testOne {
    /**
     * 1. 统计每个单词出现的次数
     * 有如下字符串"If you want to change your life I think you must come to learn English"(用空格间隔)
     * 打印格式：
     * to=3
     * think=1
     * you=2
     * @param arg
     */
    public static void main(String[] arg) {
        String st="If you want to change your life I think you must come to learn English";
        String []sts=st.split(" ");
        TreeMap<String,Integer>map=new TreeMap<>();
        for(String string:sts){
            map.put(string, map.containsKey(string)?map.get(string)+1:1);
        }
        for(Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
