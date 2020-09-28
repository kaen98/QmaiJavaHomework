package classEight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test4 {
    public static void main(String[] strings) {
        //统计数组【1，5，6，12，1，32，5，6】中每个元素出现的次数
        int[] arr = {1,5,6,12,1,32,5,6};
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for (int i=0;i<arr.length;i++) {
            if(map.get(arr[i])!=null) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }

        }

        Set<Integer> keyset=map.keySet();
        Iterator<Integer> it=keyset.iterator();
        while (it.hasNext()) {
            Integer key=it.next();
            Integer value=map.get(key);
            System.out.print(key+"共有"+value+"次    ");
        }
    }
}
