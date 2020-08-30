package demo1;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/27 11:07 下午
 */
public class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double accept(Calculation calculation) {
        return calculation.compute(this);
    }
}
