package xuzhiqiang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class questionFour {
    /**
     * 编写一段程序使 将List<String>转换为List<Object>
     * @param args
     */
    public static void main(String[] args) {
        //编写一段程序使 将List<String>转换为List<Object>
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List<Object> l = setType(list);
    }

    public static List<Object> setType(List<String> list){
        List<Object> objlist = new ArrayList<Object>();
        for(Object e : list){
            Object obj = (Object)e;
            objlist.add(obj);
        }
        return objlist;
    }
}
