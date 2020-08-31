package C4.Q2;

/**
 * 矿泉水
 */
public class MineralWater extends Drink {
    @Override
    String buy() {
        return "购买的是矿泉水";
    }

    @Override
    String choice() {
        return this.buy();
    }
}
