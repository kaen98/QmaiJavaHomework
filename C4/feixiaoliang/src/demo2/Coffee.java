package demo2;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/30 2:23 下午
 */
public class Coffee extends Drinks {
    private String charge;

    public Coffee(String name, String charge) {
        super(name);
        this.charge = charge;
    }

    public String getCharge() {
        return charge;
    }

    @Override
    public void buy() {
        System.out.println("您购买了" + this.getName() + " " + this.getCharge());
    }
}
