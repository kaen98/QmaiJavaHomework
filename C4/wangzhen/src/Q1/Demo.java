package C4.Q1;

public class Demo {
    public static void main(String[] args) {
        /**
         * 圆的周长计算，传入半径
         */
        Circular circular = new Circular(0.5);
        System.out.println(circular.getPerimeter());

        /**
         * 计算三角形 传入三边长
         */
        Triangle triangle = new Triangle(1,2,3);
        System.out.println(triangle.getPerimeter());

    }
}
