package C4.Q2;

/**
 * 百事可乐
 */
public class PepsiCola extends Cola {
    @Override
    String buy() {
        return "购买的是百事可乐";
    }

    @Override
    String choice() {
        return this.buy();
    }
}
