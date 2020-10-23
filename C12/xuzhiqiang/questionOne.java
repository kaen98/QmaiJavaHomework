package xuzhiqiang;

import java.util.HashSet;
import java.util.Iterator;

public class questionOne {
    /**
     * 编写一段程序，把"一站式门店运营服务平台"按单字符添加到HashSet中后，再删除"门店"两个字符，最后循环打印输出每一个字符
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
        Iterator<String> iterator = setInfo.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
