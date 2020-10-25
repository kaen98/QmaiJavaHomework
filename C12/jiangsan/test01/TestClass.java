package test01;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 编写一段程序，把"一站式门店运营服务平台"按单字符添加到HashSet中后，再删除"门店"两个字符，最后循环打印输出每一个字符
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("一");
        set.add("站");
        set.add("式");
        set.add("门");
        set.add("店");
        set.add("运");
        set.add("营");
        set.add("服");
        set.add("务");
        set.add("平");
        set.add("台");


        Iterator iterator;
        iterator = set.iterator();
        System.out.println("移除前：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.remove("门");
        set.remove("店");
        iterator = set.iterator();
        System.out.println("移除后：");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
