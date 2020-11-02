package C11;

import java.util.*;

/**
 2. 将玩家姓名和游戏得分录入系统，输出排名前三的玩家和其得分。
 玩家A：10分，玩家B：40分，玩家C：30分，玩家D：20分，玩家E：50分
 */
public class Q2 {
    public static void main(String[] args) {
//        Map<Integer, String> map = new TreeMap<>();
        Map<String, Integer> map = new HashMap<>();
        map.put("玩家A", 10);
        map.put("玩家B", 40);
        map.put("玩家C", 30);
        map.put("玩家D", 20);
        map.put("玩家E", 50);

//        System.out.println(Collections.sort(map.values()));

        List<Map.Entry<String, Integer>> memnerList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
//        System.out.println(memnerList);
        Collections.sort(memnerList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> member, Map.Entry<String, Integer> member1) {
                return member1.getValue().compareTo(member.getValue());
            }
        });

        int i = 0;
        for (Map.Entry user:memnerList) {
            if (i >=3) {
                break;
            }
            System.out.println(user);
            i ++;
        }


    }
}
