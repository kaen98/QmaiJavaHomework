import com.sun.javafx.geom.transform.Identity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 针对上面那段文字，删除并打印输出按自然排序的第一个字符和最后一个字符。
 */
public class Q2 {
    public static void main(String[] args) {
        String sDemo = "一站式门店运营服务平台";
        sDemo.split("");
        HashSet<String> sList = new HashSet<>(Arrays.asList(sDemo.split("")));
        System.out.println("初始：");
        System.out.println(sList);

        int i = 0;
        Iterator<String> sIterator = sList.iterator();
        while (sIterator.hasNext()) {
            sIterator.next();
            if (i == 0 || i == (sList.size())) {
                sIterator.remove();
            }
            i++;
        }

        System.out.println(sList);
    }
}
