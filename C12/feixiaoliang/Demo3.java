import java.util.*;

/**
 * 编写一段程序，统计这段文字"This class implements the <tt>Set</tt> interface, backed by a hash
 * table(actually a <tt>HashMap</tt> instance).  It makes no guarantees as to the iteration order of the set; in
 * particular, it does not guarantee that the order will remain constant over time.  This class permits the
 * <tt>null</tt> element."中不重复字符的数量。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/20 9:47 下午
 */
public class Demo3 {
    public static void main(String[] args) {

        String str = "This class implements the <tt>Set</tt> interface, backed by a hash table(actually a <tt>HashMap</tt> instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.  This class permits the <tt>null</tt> element.";

        System.out.println("不重复的字符：" + test(str));

    }

    public static ArrayList<String> test(String str) {
        //去除空格
        str = str.replace(" ", "");
        ArrayList<String> arrayList = new ArrayList<String>();

        //将字符串转换成数组
        String[] strArray = str.split("");
        //将字数组转换成集合
        List<String> arrayList1 = Arrays.asList(strArray);

        //获取到字符串中去重后的集合数据
        Set<String> toRepeat = new HashSet<>();
        toRepeat.addAll(arrayList1);

        int strLength = str.length();
        for (String s : toRepeat) {
            String replaceStr = str.replace(s, "");
            //替换后的字符长度
            int replaceStrLength = replaceStr.length();

            //如果替换后的长度缩短1个，说明该字符没有复复
            if ((strLength - replaceStrLength) == 1) {
                arrayList.add(s);
            }
        }

        return arrayList;
    }
}
