package classThree.One;

public class CircleCal extends Perimeter {
    double r;
    CircleCal(double r) {
        this.r = r;
    }

    @Override
    public double calPerimeter() {
        return 2*3.14*r;
    }
}
