package C4.Q2;

/**
 * 可乐
 */
public class Cola extends Drink {

    @Override
    String buy() {
        return "购买的是可乐";
    }

    @Override
    String choice() {
        return "可供选择的饮料有：A：可口可乐；B：百事可乐；请输入选择。";
    }

}
