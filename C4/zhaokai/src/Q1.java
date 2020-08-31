/**
 * 1. 求不同图形的周长
 * Graph类包含一个求周长的抽象方法
 * 圆
 * 三角形
 */
public class Q1 {
    public static void main(String args[]) {
        Graph round = new Round(1);
        Graph triangle = new Triangle(1, 2, 3);
        Graph[] graphList = {round, triangle};

        for (Graph g : graphList) {
            System.out.println(g.getClass() + " - getPerimeter: " + g.getPerimeter());
        }
    }

}

abstract class Graph {
    public abstract double getPerimeter();
}

class Round extends Graph {
    /**
     * 半径
     */
    private double r = 0;

    private final double pi = 3.14;

    public Round(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return pi * 2 * r;
    }
}

class Triangle extends Graph {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
