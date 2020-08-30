package demo1;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/27 11:04 下午
 */
public interface Shape {
    /**
     * 接受策略对象
     *
     * @param calculation 策略对象
     * @return 策略计算值
     */
    double accept(Calculation calculation);
}
