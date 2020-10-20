import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 编写一段程序，统计这段文字"This class offers constant time performance for the basic operations add remove contains and size"
 * 中不重复词语的数量，并按序列打印输出。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/20 9:47 下午
 */
public class Demo4 {
    public static void main(String[] args) {
        String str = "This class offers constant time performance for the basic operations add remove contains and size";
        //统一转换成小写，防止有单词区分大小写
        str = str.toLowerCase();
        //字符串转换成数组
        String[] strArray = str.split(" ");
        //定义单词为key 出现次数为value
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String word : strArray) {
            Integer num = hashMap.get(word);
            if(num == null){
                num = 0;
            }
            ++num;
            hashMap.put(word, num);
        }

        //输出次数为1的key
        for (Map.Entry<String,Integer> mapEntry:hashMap.entrySet()) {
            Integer num = mapEntry.getValue();
            if(num == 1){
                System.out.println(mapEntry.getKey());
            }
        }
    }
}
