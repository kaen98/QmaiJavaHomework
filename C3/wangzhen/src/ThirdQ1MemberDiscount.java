public class ThirdQ1MemberDiscount {
    public static void main(String[] args) {
        Integer memberLevel = 3;//会员等级
        Integer cost = 10000;//分位值消费金额
        System.out.println(getDiscount(memberLevel, cost));
    }

    public static int getDiscount(int level, int cost) {
        int discount = 100;
        switch (level) {
            // 1级会员消费满100打9折
            case 1:
                if (cost >= 10000) {
                    discount = 90;
                }
                break;
            case 2:
                // 2级会员消费满100打8折，满200打7.5折
                if (cost >= 20000) {
                    discount = 75;
                } else if (cost >= 10000) {
                    discount = 80;
                }
                break;
            case 3:
                // 3级会员消费满100打7折，满200打6.5折，满300打6折；
                if (cost >= 30000) {
                    discount = 60;
                } else if (cost >= 20000) {
                    discount = 65;
                } else if (cost >= 10000) {
                    discount = 70;
                }
                break;
            default:
                // 非会员消费满500打9折；
                if (cost >= 30000) {
                    discount = 90;
                }
                break;
        }
        return discount;
    }

}
