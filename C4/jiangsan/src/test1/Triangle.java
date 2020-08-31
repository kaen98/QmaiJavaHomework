package test1;

/**
 * @author san
 */
public class Triangle extends Graph {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void perimeter() {
        System.out.println("三角形形周长" + (a + b + c));
    }
}
