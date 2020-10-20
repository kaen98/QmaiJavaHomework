import java.util.*;

/**
 * 编写一段程序，把"一站式门店运营服务平台"按单字符添加到HashSet中后，再删除"门店"两个字符，最后循环打印输
 * 出每一个字符
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/20 9:45 下午
 */
public class Demo1 {
    public static void main(String[] args){
        String str = "一站式门店运营服务平台";
        char[] strArray = str.toCharArray();

        Set<String> set = new HashSet<>();
        for (char s:strArray) {
            set.addAll(Collections.singleton(String.valueOf(s)));
        }

        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.equals("门") || s.equals("店")){
                iterator.remove();
            }
        }

        System.out.println(set);
    }
}
