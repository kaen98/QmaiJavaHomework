import java.util.Objects;
import java.util.Scanner;

/**
 * 定义一个月份枚举，1-> 1月， 2 -> 2月，以此类推，根据输入的数值返回对应的月份
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/11/8 10:57 下午
 */
public class Demo1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int i = scanner.nextInt();
        String monthString = Month.getDesc(i);
        if (Objects.isNull(monthString)){
            System.out.println("输入月份有误");
        }else{
            System.out.println(monthString);
        }
    }
}

enum Month{
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

    int value;
    String desc;

    Month(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public int getValue() {
        return value;
    }

    public static String getDesc(int value) {
        for (Month month:Month.values()){
            if(Objects.equals(month.value, value)){
                return month.desc;
            }
        }

        return null;
    }
}
