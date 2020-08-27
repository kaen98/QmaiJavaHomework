/**
 * 写一段会员打折的程序代码，规则如下
 *
 * @author San
 */
public class Discount {

    private static final int MONEY_100 = 100;
    private static final int MONEY_200 = 200;
    private static final int MONEY_300 = 300;
    private static final int MONEY_500 = 500;

    public static double vipDiscount(Integer type, double money) {
        double resultMoney;

        switch (type) {
            case 1:
                if (money >= MONEY_100) {
                    resultMoney = money * 0.9;
                } else {
                    resultMoney = money;
                }
                break;
            case 2:
                if (money >= MONEY_100) {
                    resultMoney = money * 0.8;
                } else if (money >= MONEY_200) {
                    return money * 0.75;
                } else {
                    resultMoney = money;
                }
                break;
            case 3:
                if (money >= MONEY_100) {
                    resultMoney = money * 0.7;
                } else if (money >= MONEY_200) {
                    resultMoney = money * 0.65;
                } else if (money >= MONEY_300) {
                    resultMoney = money * 0.6;
                } else {
                    resultMoney = money;
                }
                break;
            default:
                if (money >= MONEY_500) {
                    resultMoney = money * 0.9;
                } else {
                    resultMoney = money;
                }
                break;
        }

        return resultMoney;
    }

    public static void main(String[] args) {

        float originMoney = 124.56f;
        double resultMoney;

        resultMoney = vipDiscount(1, originMoney);

        System.out.println(resultMoney);
    }
}
