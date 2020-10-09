package C10;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String> ImList= new ArrayList<>();
        ImList.add("a");
        ImList.add("a");
        ImList.add("b");
        ImList.add("b");
        ImList.add("c");
        ImList.add("xxx");
        ImList.remove(5);
        System.out.println(ImList);
    }
}
