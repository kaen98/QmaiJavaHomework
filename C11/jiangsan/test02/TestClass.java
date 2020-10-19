package test02;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestClass {
    public static void main(String[] args) {

        TreeMap<User, Integer> treeMap = new TreeMap<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getScore() - o1.getScore();
            }
        });

        User u1 = new User("玩家A", 10);
        User u2 = new User("玩家B", 40);
        User u3 = new User("玩家C", 30);
        User u4 = new User("玩家D", 20);
        User u5 = new User("玩家E", 50);
        treeMap.put(u1, u1.getScore());
        treeMap.put(u2, u2.getScore());
        treeMap.put(u3, u3.getScore());
        treeMap.put(u4, u4.getScore());
        treeMap.put(u5, u5.getScore());

        for (Map.Entry entry : treeMap.entrySet())
            System.out.println(entry.getKey() + "->" + entry.getValue());
    }
}