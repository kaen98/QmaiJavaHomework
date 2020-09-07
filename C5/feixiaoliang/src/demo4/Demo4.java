package demo4;

/**
 * throw和throws的区别是什么？请写一段程序加以说明
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/7 12:00 上午
 */
public class Demo4 {
    public static void main(String[] args){
        try {
            test();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        test("主动错误");
    }

    public static void test() throws Exception {
        throw new RuntimeException("程序错误");
    }

    public static String test(String message){
        try {
            throw  new Exception("try异常抛出");
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
