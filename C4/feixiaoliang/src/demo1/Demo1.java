package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/29 2:03 下午
 */
public class Demo1 {
    public static void main(String[] args) {

        //三角形
        Triangle triangle = new Triangle(1, 2, 3);

        //圆形
        Round round = new Round(4.2);

        //计算周长策略
        Perimeter perimeter = new Perimeter();

        System.out.println("三角形周长:" + triangle.accept(perimeter));
        System.out.println("圆形周长:" + round.accept(perimeter));

    }
}
