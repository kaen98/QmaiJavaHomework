package classThree.One;

public class TriangleCal extends Perimeter {

    double a,b,c;
    TriangleCal(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        if(a <=0 || b<=0 || c<=0) {
            return 0;
        } else {
            return a+b+c;
        }
    }
}
