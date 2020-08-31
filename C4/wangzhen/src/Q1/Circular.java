package C4.Q1;

/**
 * 圆形类
 */
public class Circular extends Graph {

    /**
     * 半径
     */
    private double mRadius;

    public Circular(double mRadius){
        this.mRadius = mRadius;
    }

    public double getPerimeter() {
        return 2*Math.PI*mRadius;
    }
}
