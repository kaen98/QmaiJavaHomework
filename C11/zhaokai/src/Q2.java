import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.TreeMap;

/**
 * 2. 将玩家姓名和游戏得分录入系统，输出排名前三的玩家和其得分。
 * 玩家A：10分，玩家B：40分，玩家C：30分，玩家D：20分，玩家E：50分
 */
public class Q2 {
    public static void main(String[] args) {
        TreeMap<Play, Integer> plays = new TreeMap<>();
        plays.put(new Play("玩家A", 10), 10);
        plays.put(new Play("玩家B", 40), 40);
        plays.put(new Play("玩家C", 30), 30);
        plays.put(new Play("玩家D", 20), 20);
        plays.put(new Play("玩家E", 50), 50);

        System.out.println(plays);
    }
}

class Play implements Comparable<Play> {
    public String name;
    public Integer age;

    public Play(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Play other) {
//        return this.age - other.age;
        return other.age - this.age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
