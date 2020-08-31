package classThree.One;

public class PerimeterGain {
    public static void main(String[] strings) {
        CircleCal circle = new CircleCal(2);
        TriangleCal triangle = new TriangleCal(1,2,3);
        System.out.println("三角形周长:" + circle.calPerimeter());
        System.out.println("圆形周长:" + triangle.calPerimeter());
    }
}
