import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 统计每个单词出现的次数
 * 有如下字符串"If you want to change your life I think you must come to learn English"(用空格间隔)
 * 打印格式：
 * to=3
 * think=1
 * you=2
 *
 * @author fei <xliang.fei@gmail.com>
 */
public class Demo1 {
    public static void main(String[] args) {

        String str = "If you want to change your life I think you must come to learn English";
        String[] strArray = str.split(" ");
        HashMap<String, Integer> numberStatistical = new HashMap<>();
        for (String s : strArray) {
            Integer num = numberStatistical.get(s);
            if (num == null) {
                num = 0;
            }
            num += 1;
            numberStatistical.put(s, num);
        }

        Set<String> keySet = numberStatistical.keySet();

        for (String key : keySet) {
            Integer num = numberStatistical.get(key);
            System.out.println(key + "=" + num);
        }
    }
}
