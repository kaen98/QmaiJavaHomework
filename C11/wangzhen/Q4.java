package C11;

import java.util.*;

/**
 4. 人事部需对公司员工籍贯进行统计，请输出地区和对应的员工姓名
 Jack：安徽
 Rose：江苏
 Divid：浙江
 Lily：安徽
 Lucy：浙江
 Tom：山东
 */
public class Q4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Jack", "安徽");
        map.put("Rose", "江苏");
        map.put("Divid", "浙江");
        map.put("Lily", "安徽");
        map.put("Lucy", "浙江");
        map.put("Tom", "山东");

        for (Map.Entry<String, String> subset: map.entrySet()) {
            System.out.println(subset.getKey() + ":" +subset.getValue());
        }
    }
}
