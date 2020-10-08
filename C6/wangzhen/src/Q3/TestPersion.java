package C6.Q3;
import java.util.HashSet;
import java.util.Set;

public class TestPersion {
    public static void main(String[] strings) {
        Set<Object> set = new HashSet();
        Persion s1 = new Persion(1,"张三","男");
        Persion s2 = new Persion(1,"李四","女");
        Persion s3 = new Persion(3,"王二麻","男");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("set size:"+ set.size());

    }
}
