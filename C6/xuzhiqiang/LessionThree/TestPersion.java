package classSix.LessionThree;
import java.util.HashSet;
import java.util.Set;

public class TestPersion {
    public static void main(String[] strings) {
        Set<Object> set = new HashSet();
        Persion s1 = new Persion(1,"张三","男");
        Persion s2 = new Persion(1,"张五","女");
        Persion s3 = new Persion(3,"张六","男");
        Persion s4 = new Persion(4,"张八","女");
        Persion s5 = new Persion(5,"王五","男");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        System.out.println("set size:"+ set.size());

    }
}
