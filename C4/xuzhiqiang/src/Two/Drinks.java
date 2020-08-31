package classThree.Two;

public class Drinks {
    /**
     * 饮料
     */
    private String DrinkName;

    /**
     * 加料
     */
    private String Feeding;

    public Drinks() {
        super();
    }

    Drinks(String DrinkName, String Feeding) {
        this.DrinkName = DrinkName;
        this.Feeding = Feeding;
    }

    public String getDrinkName() {
        return DrinkName;
    }

    public String getFeeding()
    {
        return Feeding;
    }

    public void setDrinkName(String DrinkName) {
        this.DrinkName = DrinkName;
    }

    public void SetFeeding(String Feeding) {
        this.Feeding = Feeding;
    }

    //购买信息
    public void show(){
        System.out.println("您购买饮料的信息如下：");
    }
}
