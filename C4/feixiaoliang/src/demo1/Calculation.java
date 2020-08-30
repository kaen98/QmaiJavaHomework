package demo1;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/27 11:05 下午
 */
public interface Calculation {
    /**
     * 计算三角形周长
     *
     * @param triangle 三角形
     * @return 周长
     */
    double compute(Triangle triangle);

    /**
     * 计算圆形周长
     *
     * @param round 圆形
     * @return 周长
     */
    double compute(Round round);
}
