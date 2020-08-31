package C4.Q2;

/**
 * 可口可乐
 */
public class CocaCola extends Cola {
    @Override
    String buy() {
        return "购买的是可口可乐";
    }

    @Override
    String choice() {
        return this.buy();
    }
}
