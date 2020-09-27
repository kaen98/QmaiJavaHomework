package src;

/**
 * 定义一个数组，其中元素为公司的一级部门名称，按照【下标:值】格式打印出来。
 * 如：0:xxx, 1:xxx, 2:xxx
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/23 4:43 下午
 */
public class Demo1 {
    public static void main(String[] args){ 
    
        String[] s = new String[5];
        s[0] = "技术部";
        s[1] = "奶茶部";
        s[2] = "技术部";
        s[3] = "ALL IN部";
        s[4] = "血战部";

        for (int i = 0; i < s.length; i++) {
            System.out.println(i+":"+s[i]);
        }
    }
}
