import java.util.Arrays;
import java.util.HashSet;

/**
 * 编写一段程序，把"一站式门店运营服务平台"按单字符添加到HashSet中后，再删除"门店"两个字符，最后循环打印输出每一个字符。
 */
public class Q1 {
    public static void main(String[] args) {
        String sDemo = "一站式门店运营服务平台";
        sDemo.split("");
        HashSet<String> sList = new HashSet<>(Arrays.asList(sDemo.split("")));
        System.out.println("初始：");
        System.out.println(sList);

        sList.remove("门");
        sList.remove("店");
        System.out.println("移除 '门店' 2个字符后：");
        System.out.println(sList);
    }
}
