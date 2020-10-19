package xuzhiqiang;

import java.util.*;

public class testTwo {
    /**
     * 2. 将玩家姓名和游戏得分录入系统，输出排名前三的玩家和其得分。
     * 玩家A：10分，玩家B：40分，玩家C：30分，玩家D：20分，玩家E：50分
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 2. 将玩家姓名和游戏得分录入系统，输出排名前三的玩家和其得分。
         * 玩家A：10分，玩家B：40分，玩家C：30分，玩家D：20分，玩家E：50分
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("玩家A", 10);
        map.put("玩家B", 40);
        map.put("玩家C", 30);
        map.put("玩家D", 20);
        map.put("玩家E", 50);

        Set<String> nameSet = map.keySet();
        List<String> name = new ArrayList<>();
        List<Integer> score = new ArrayList<>();
        for (String n : nameSet) {
            name.add(n);
            score.add(map.get(n));
        }
        for (int i = 0; i < score.size() - 1; i++) {
            for (int j = i + 1; j < score.size(); j++) {
                if (score.get(i) < score.get(j)) {
                    Collections.swap(score, i, j);
                    Collections.swap(name, i, j);
                }
            }
        }

        System.out.println("成绩前三名：");
        for (int i = 0; i < 3; i++) {
            System.out.println("姓名：" + name.get(i) + ",成绩：" + score.get(i));
        }
    }
}
