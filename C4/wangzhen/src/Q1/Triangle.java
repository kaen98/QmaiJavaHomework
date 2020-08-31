package C4.Q1;

/**
 * 三角形类
 */
public class Triangle extends Graph {

    private double aLength;
    private double bLength;
    private double cLength;

    public Triangle(double aLength , double bLength , double cLength)
    {
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }

    public double getPerimeter() {
        return this.aLength + this.bLength + this.cLength;
    }
}
