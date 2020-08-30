package demo4;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/30 4:25 下午
 */
public class Division implements Compute {
    public final String operator = "/";

    @Override
    public int computer(int n, int m) {
        return n / m;
    }

    @Override
    public String getOperator() {
        return operator;
    }
}
