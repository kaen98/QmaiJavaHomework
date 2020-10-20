import java.util.*;

/**
 * "一站式门店运营服务平台"
 * 针对上面那段文字，删除并打印输出按自然排序的第一个字符和最后一个字符
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/20 9:46 下午
 */
public class Demo2 {
    public static void main(String[] args){
        String str = "一站式门店运营服务平台";

        //删除"门店"字符
        str = str.replace("门店", "");

        //将字符串转为数组
        String[] strArray = str.split("");
        //将数组转成集合
        List<String> strArray1 = Arrays.asList(strArray);
        //自然排序添加
        TreeSet<String> set = new TreeSet<>();
        set.addAll(strArray1);

        //打印第一个字符
        System.out.println(set.first());
        //打印最后一个字符
        System.out.println(set.last());

    }
}
