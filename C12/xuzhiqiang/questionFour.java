package xuzhiqiang;

import java.util.HashSet;
import java.util.Iterator;

public class questionFour {
    /**
     * 编写一段程序，统计这段文字"This class offers constant time performance for the basic operations add
     * remove contains and size"中不重复词语的数量，并按序列打印输出
     * @param args
     */
    public static void main(String[] args) {
        String str = "This class offers constant time performance for the basic operations add remove contains and size";
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        HashSet<String> combineData = new HashSet<>();
        int count = 0;
        for(String s : arr) {
            if(!combineData.contains(s)) {
                combineData.add(s);
                count ++;
            }
        }

        System.out.println("不重复的词语数量是" + count + "个，他们分别是");

        Iterator<String> iterator = combineData.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
