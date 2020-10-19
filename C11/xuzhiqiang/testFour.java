package xuzhiqiang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testFour {

    /**
     * 人事部需对公司员工籍贯进行统计，请输出地区和对应的员工姓名
     * Jack：安徽
     * Rose：江苏
     * Divid：浙江
     * Lily：安徽
     * Lucy：浙江
     * Tom：山东
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, String> staff = new HashMap<>();
        staff.put("Jack", "安徽");
        staff.put("Rose", "江苏");
        staff.put("Divid", "浙江");
        staff.put("Lily", "安徽");
        staff.put("Lucy", "浙江");
        staff.put("Tom", "山东");
        Set<Map.Entry<String, String>> entrySet = staff.entrySet();
        for(Map.Entry<String, String> ent : entrySet){
            System.out.println(ent.getKey()+":"+ent.getValue());
        }

    }
}
