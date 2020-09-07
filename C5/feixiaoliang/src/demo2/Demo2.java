package demo2;

/**
 * 捕获异常代码块中，只有try/finally语句而没有catch语句是否可以，请编写一段函数加以验证。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/6 2:15 下午
 */
public class Demo2 {
    public static void main(String[] args) {

        try {
            System.out.println("这是try正常运行");
        } finally {
            System.out.println("这是finally正常运行");
        }

    }
}
