package demo1;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/27 11:13 下午
 */
public class Round implements Shape {
    private double r;

    public final double PI = 3.14;

    public Round(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double accept(Calculation calculation) {
        return calculation.compute(this);
    }
}
