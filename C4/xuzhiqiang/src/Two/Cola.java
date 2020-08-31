package classThree.Two;

public class Cola extends Drinks{
    public void show() {
        System.out.println("您购买饮料的信息如下：");
        System.out.println("名称："+super.getDrinkName());
        System.out.println("品牌："+super.getFeeding());
    }
}
