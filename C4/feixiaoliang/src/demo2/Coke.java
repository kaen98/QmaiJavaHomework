package demo2;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/30 2:27 下午
 */
public class Coke extends Drinks{
    private String charge;

    public Coke(String name, String charge) {
        super(name);
        this.charge = charge;
    }

    public String getCharge() {
        return charge;
    }

    @Override
    public void buy() {
        System.out.println("您购买了" + this.getCharge() + this.getName());
    }
}
