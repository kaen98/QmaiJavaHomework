package test1;

/**
 * @author san
 */
public class Round extends Graph {
    double a;

    public Round(double a) {
        this.a = a;
    }

    @Override
    public void perimeter() {
        System.out.println("圆形周长" + (2 * 3.14 * a));
    }
}
