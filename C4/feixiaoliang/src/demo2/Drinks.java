package demo2;

/**
 * 饮料
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/30 2:15 下午
 */
public class Drinks {
    private String name;

    public Drinks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void buy() {
        System.out.println("您购买了" + name);
    }
}
