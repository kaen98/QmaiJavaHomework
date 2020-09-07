package demo3;

/**
 * 对于finally语句段中的代码一定会执行吗？请编写一段程序进行验证。
 *
 * 一共有3种情况：
 * ①、return在try外面，finally是不会执行的
 * ②、return在try里面，变量值会暂存，无论finally对该变量做什么，最终返回值缺是try中的暂存值
 * ③、try与finally里都有return，执行finally的return，会忽略try中的return
 *
 *
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/6 2:16 下午
 */
public class Demo3 {
    public static void main(String[] args) {
//        System.out.println("返回数字是：" + test(1));
//        System.out.println("返回数字是：" + test());
        System.out.println("返回数字是：" + test1());
    }

    public static int test(int i) {
        if(i == 1){
            return i;
        }
        try {
            System.out.println("执行到try");
            return 2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("执行到finally");
        }

        return 0;
    }

    public static int test() {
        try {
            return 2;
        } catch (Exception e) {
        } finally {
            return 3;
        }
    }

    public static int test1() {
        int i = 0;
        try {
            System.out.println("test1()执行到try");
            return ++i;
        } catch (Exception e) {
        } finally {
            System.out.println("test1()执行到finally");
            return ++i;
        }
    }
}
