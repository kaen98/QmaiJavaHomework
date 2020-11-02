/**
 * 1.定义一个月份枚举，1-> 1月， 2 -> 2月，以此类推，根据输入的数值返回对应的月份
 */
public class Q1 {
    public static void main(String[] args) {
        for (Month m : Month.values()) {
            System.out.println(m.getVal() + "->" + m.getDesc());
        }
    }
}

enum Month {
    January(1, "1月"),
    February(2, "2月"),
    March(3, "3月"),
    April(4, "4月"),
    May(5, "5月"),
    June(6, "6月"),
    July(7, "7月"),
    August(8, "8月"),
    September(9, "9月"),
    October(10, "10月"),
    November(11, "11月"),
    December(12, "12月");

    private final int val;
    private final String desc;

    public int getVal() {
        return val;
    }

    public String getDesc() {
        return desc;
    }

    Month (int val, String desc)
    {
        this.val = val;
        this.desc = desc;
    }
}
