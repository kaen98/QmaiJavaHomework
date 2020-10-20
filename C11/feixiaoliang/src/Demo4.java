import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 人事部需对公司员工籍贯进行统计，请输出地区和对应的员工姓名
 * Jack：安徽
 * Rose：江苏
 * Divid：浙江
 * Lily：安徽
 * Lucy：浙江
 * Tom：山东
 *
 * @author fei <xliang.fei@gmail.com>
 */
public class Demo4 {
    public static void main(String[] args) {

        HashMap<String, String> member = new HashMap();
        member.put("Jack", "安徽");
        member.put("Rose", "江苏");
        member.put("Divid", "浙江");
        member.put("Lily", "安徽");
        member.put("Lucy", "浙江");
        member.put("Tom", "山东");

        HashMap<String, ArrayList<String>> list = new HashMap<>();

        ArrayList<String> nameList = new ArrayList<String>();

        Set<String> keySet = member.keySet();
        for (String name : keySet) {
            String region = member.get(name);
            nameList = list.get(region);
            if(nameList == null){
                nameList = new ArrayList<>();
            }
            nameList.add(name);
            list.put(region, nameList);
        }

        System.out.println(list);
    }
}
