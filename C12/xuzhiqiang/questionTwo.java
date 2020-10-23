package xuzhiqiang;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class questionTwo {
    /**
     * 针对上面那段文字，删除并打印输出按自然排序的第一个字符和最后一个字符
     * @param args
     */
    public static void main(String[] args) {
        String str = "一站式门店运营服务平台";
        String[] arr = str.split("");
        HashSet<String> setInfo = new HashSet<>();
        for (String s : arr) {
            setInfo.add(s);
        }

        setInfo.remove("门");
        setInfo.remove("店");

        Set<String> stringSet = new TreeSet<>();
        stringSet.addAll(setInfo);

        int index = 0;
        int size = stringSet.size();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (index == 0 || index == size - 1) {
                iterator.remove();
            } else {
                System.out.println(next);
            }
            index++;
        }

    }
}
