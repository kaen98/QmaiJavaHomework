package test4;

/**
 * @author san
 */
public class SubCompute implements Compute {
    @Override
    public int computer(int n, int m) {
        return n - m;
    }
}
