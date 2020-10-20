import java.util.*;

/**
 * 将玩家姓名和游戏得分录入系统，输出排名前三的玩家和其得分。
 * 玩家A：10分，玩家B：40分，玩家C：30分，玩家D：20分，玩家E：50分
 *
 * @author fei <xliang.fei@gmail.com>
 */
public class Demo2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> member = new TreeMap<>();
        member.put("玩家A", 10);
        member.put("玩家B", 40);
        member.put("玩家C", 30);
        member.put("玩家D", 20);
        member.put("玩家E", 50);

        List<Map.Entry<String, Integer>> memnerList = new ArrayList<Map.Entry<String, Integer>>(member.entrySet());

        Collections.sort(memnerList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> member, Map.Entry<String, Integer> member1) {
                return member1.getValue().compareTo(member.getValue());
            }
        });

        System.out.println(memnerList);
    }
}
