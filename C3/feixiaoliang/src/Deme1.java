/**
 * 写一段会员打折的程序代码，规则如下：
 * 1级会员消费满100打9折；
 * 2级会员消费满100打8折，满200打7.5折
 * 3级会员消费满100打7折，满200打6.5折，满300打6折；
 * 非会员消费满500打9折；
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/25 7:49 下午
 */
public class Deme1 {
    public static void main(String[] args) {
        String level = "1";
        double amount = 300;

        System.out.println("会员等级：" + level + " 消费：" + amount + " 折扣：" + getMemberDiscount(level, amount));
    }

    /**
     * 获取会员折扣
     *
     * @param level  等级
     * @param amount 消费金额
     * @return 会员折扣
     */
    public static double getMemberDiscount(String level, double amount) {
        double discount = 10;

        switch (level) {
            //1级会员
            case "1":
                if (amount >= 100) {
                    discount = 9;
                }
                break;
            //2级会员
            case "2":
                if (amount >= 200) {
                    discount = 7.5;
                } else if (amount >= 100) {
                    discount = 8;
                }
                break;
            //3级会员
            case "3":
                if (amount >= 300) {
                    discount = 6;
                } else if (amount >= 200) {
                    discount = 6.5;
                } else if (amount >= 100) {
                    discount = 7;
                }
                break;
            //非会员
            default:
                discount = 9;
                break;
        }

        return discount;
    }
}
