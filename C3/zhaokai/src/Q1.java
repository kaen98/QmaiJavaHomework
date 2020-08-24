public class Q1
{
    public static void main(String[] args)
    {
        System.out.println(getDiscount(1, 100));
        System.out.println(getDiscount(4, 100));
    }

    /**
     * 获取折扣
     * @param member_level 会员等级
     * @param order_paid_amount 消费金额
     */
    public static double getDiscount(int member_level, double order_paid_amount)
    {
        switch (member_level) {
            case 1:
                if (order_paid_amount >= 100) {
                    return 9.0;
                }
                break;
            case 2:
                if (order_paid_amount >= 200) {
                    return 7.5;
                }
                if (order_paid_amount >= 100) {
                    return 8.0;
                }
                break;
            case 3:
                // 3级会员消费满100打7折，满200打6.5折，满300打6折；
                if (order_paid_amount >= 300) {
                    return 6.0;
                }
                if (order_paid_amount >= 200) {
                    return 6.5;
                }
                if (order_paid_amount >= 100) {
                    return 7.0;
                }
                break;
            default:
                if (order_paid_amount >= 500) {
                    return 9.0;
                }
        }

        return 10.0;
    }
}
