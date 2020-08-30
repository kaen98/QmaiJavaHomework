package demo1;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/27 11:09 下午
 */
public class Perimeter implements Calculation {
    @Override
    public double compute(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    @Override
    public double compute(Round round) {
        return round.PI * round.getR() * round.getR();
    }
}
