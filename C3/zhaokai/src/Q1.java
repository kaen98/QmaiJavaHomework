public class Q1
{
    public static void main(String[] args)
    {

    }

    /**
     * 获取折扣
     * @param member_level 会员等级
     * @param order_paid_amount 消费金额
     * @return
     */
    public static double getDiscount(int member_level, double order_paid_amount)
    {
        switch (member_level) {
            case 1:
                if (order_paid_amount > 100) {
                    return 9.0;
                }
                break;
            case 2:
                if () {

                }
        }
    }
}
