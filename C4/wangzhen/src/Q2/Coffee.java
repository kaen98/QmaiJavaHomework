package C4.Q2;

/**
 * 咖啡
 */
public class Coffee extends Drink {
    static String zuofa;
    @Override
    String buy() {
        return "购买的是咖啡"+"做法是："+this.getZuofa();
    }

    @Override
    String choice() {
        return "可供选择的做法有：A：加糖；B：加冰；请输入选择。";
    }

    public static void setZuofa(String zuofa) {
        if ("A".equals(zuofa)) {
            Coffee.zuofa = "加糖";
        }
        if ("B".equals(zuofa)) {
            Coffee.zuofa = "加冰";
        }
    }

    public static String getZuofa() {
        return zuofa;
    }
}
