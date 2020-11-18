package C15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Q4 {
    public static void main(String[] args) {
       //编写一段程序使 将List<String>转换为List<Object>
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List<Object> l = setType(list);
    }

    //将List<String>转换为List<Object>
    public static List<Object> setType(List<String> list){
        List<Object> l = new ArrayList<>();
        Iterator<String> item = list.iterator();
        while(item.hasNext()){
            l.add(item.next());
        }
        return l;
    }
}
