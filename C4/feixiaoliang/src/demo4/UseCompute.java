package demo4;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/30 4:28 下午
 */
public class UseCompute {
    public void useCom(Compute com, int one, int two) {
        System.out.println(one + com.getOperator() + two + "=" + com.computer(one, two));
    }
}
