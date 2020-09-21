/**
 * 统计一个字符串里面另一个字符串出现的次数，例如统计"monkey"在"I am monkey1024.monkey like banana.little monkey is smart."中出现的次数
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/21 1:39 上午
 */
public class Demo1 {
    public static void main(String[] args) {

        String str = "I am monkey1024.monkey like banana.little monkey is smart.";
        String searchStr = "monkey";


        System.out.println(searchStr + "出现次数：" + stringOccurrences(str, searchStr));
    }

    /**
     * 查看字符在某一字符串出现次数
     *
     * @param str       原字符串
     * @param searchStr 查找字符
     * @return 次数
     */
    public static int stringOccurrences(String str, String searchStr) {
        //次数
        int count = 0;
        //字符位置
        int index = 0;

        //indexOf返回首次出现的位置
        while ((index = str.indexOf(searchStr, index)) != -1) {
            index = index + searchStr.length();
            count++;
        }

        return count;
    }
}
