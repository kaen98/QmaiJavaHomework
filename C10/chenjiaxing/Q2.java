package C10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Q2 {
    public static void main(String[] args) {
        /**
         * 2.  定义一个集合， 要求：
         * 1）元素及对应元素出现次数分别为 "a":2,“b”:3“c”:1,
         * 2） 删除重复的元素
         */

        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
        Iterator<String> item = arrayList.iterator();
        while(item.hasNext()){
            //统计元素出现次数 > 1的删除
            if (Collections.frequency(arrayList, item.next()) > 1) {
                item.remove();
            }
         }
        System.out.println(arrayList);
    }
}
