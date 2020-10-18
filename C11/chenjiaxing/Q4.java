package C11;

import java.util.*;

class Q4 {
    public static void main(String[] args) {
        /**
         * 4. 人事部需对公司员工籍贯进行统计，请输出地区和对应的员工姓名
         * Jack：安徽
         * Rose：江苏
         * Divid：浙江
         * Lily：安徽
         * Lucy：浙江
         * Tom：山东
         */
        HashMap<String, String> str = new HashMap<>();
        str.put("Jacl", "安徽");
        str.put("Rose", "江苏");
        str.put("Divid", "浙江");
        str.put("Lily", "安徽");
        str.put("Lucy", "浙江");
        str.put("Tom", "山东");
        Set<Map.Entry<String, String>> entrySet = str.entrySet();
        for(Map.Entry<String, String> ent : entrySet){
            System.out.println("姓名:"+ent.getKey()+";地区:"+ent.getValue());
        }
    }
}

