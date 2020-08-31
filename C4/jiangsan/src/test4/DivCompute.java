package test4;

import sun.tools.tree.DivideExpression;

/**
 * @author san
 */
public class DivCompute implements Compute {
    @Override
    public int computer(int n, int m) {
        try {
            return n / m;
        } catch (Exception b) {
            System.out.print("捕获exception异常");
        }
        return 0;
    }
}
