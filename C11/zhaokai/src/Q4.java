import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 4. 人事部需对公司员工籍贯进行统计，请输出地区和对应的员工姓名
 * Jack：安徽
 * Rose：江苏
 * Divid：浙江
 * Lily：安徽
 * Lucy：浙江
 * Tom：山东
 */
public class Q4 {

    public static HashMap<String, ArrayList<String>> jiguanTable = new HashMap<>();

    public static void main(String[] args) {
        add("Jack", "安徽");
        add("Rose","江苏");
        add("Divid","浙江");
        add("Lily","安徽");
        add("Lucy","浙江");
        add("Tom","山东");

        System.out.println(jiguanTable);
        // 输出： {山东=[Tom], 浙江=[Divid, Lucy], 江苏=[Rose], 安徽=[Jack, Lily]}
    }

    public static HashMap<String, ArrayList<String>> add(String name, String jiguan) {

        if (jiguanTable.containsKey(jiguan)) {
            ArrayList<String> nameList = jiguanTable.get(jiguan);
            nameList.add(name);
        } else {
            ArrayList<String> nameList = new ArrayList<>();
            nameList.add(name);
            jiguanTable.put(jiguan, nameList);
        }

        return jiguanTable;
    }
}
