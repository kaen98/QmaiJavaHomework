package test01;

import java.util.Objects;

/**
 * 定义一个月份枚举，1-> 1月， 2 -> 2月，以此类推，根据输入的数值返回对应的月份
 *
 * @author san
 */

enum Month {
    Jan(1, "一月"),
    Feb(2, "二月"),
    Mar(3, "三月"),
    Apr(4, "四月"),
    May(5, "五月"),
    Jun(6, "六月"),
    Jul(7, "七月"),
    Aug(8, "八月"),
    Sep(9, "九月"),
    Oct(10, "十月"),
    Nov(11, "十一月"),
    Dec(12, "十二月");

    public int value;
    public String desc;

    Month(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static String getDesc(int value) {

        for (Month month : Month.values()) {
            if (Objects.equals(month.value, value)) {
                return month.desc;
            }
        }

        throw new IllegalArgumentException("参数非法");
    }
}


/**
 * @author san
 */
public class TestClass {
    public static void main(String[] args) {
        System.out.println(Month.getDesc(2));
    }
}
