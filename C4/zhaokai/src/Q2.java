import java.util.Scanner;

/**
 * 2. 编写程序实现软料购买：编写程序，接收用户输入的信息，选择购买的饮料。可供选择的饮料有：咖啡、矿泉水和可乐。
 * 其中，购买咖啡时可以选择：加糖、加奶还是什么都不加。购买可乐时可以选择：买可口可乐还是百事可乐
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isContinue = true;


        System.out.println("请选择购买的饮料: 1.咖啡， 2.矿泉水， 3.可乐");
        if (scan.hasNext()) {
            int selectDrink = scan.nextInt();
            if (selectDrink == 1) {
                Coffee drink = new Coffee();
                System.out.println("咖啡需要加糖？ 0 不需要 1：需要");
                int needSugar = scan.nextInt();
                if (needSugar == 1) {
                    drink.addSugar();
                }
                System.out.println("咖啡需要加奶？ 0 不需要 1：需要");
                int needMilk = scan.nextInt();
                if (needMilk == 1) {
                    drink.addMilk();
                }

                System.out.println("您已成功选择：" + drink.toString());
            }

            if (selectDrink == 2) {
                MineralWater drink = new MineralWater();
                System.out.println("您已成功选择：" + drink.toString());
            }

            if (selectDrink == 3) {
                while (isContinue) {
                    System.out.println("百事 还是 可口可乐？ 1.百事; 2.可口可乐");
                    int whatCoke = scan.nextInt();
                    if (whatCoke == 1) {
                        Pepsi drink = new Pepsi();
                        isContinue = false;
                        System.out.println("您已成功选择：" + drink.toString());
                    }else if (whatCoke == 2) {
                        CocaCola drink = new CocaCola();
                        isContinue = false;
                        System.out.println("您已成功选择：" + drink.toString());
                    }else{
                        System.out.println("无法识别， 请重新输入");
                        isContinue = true;
                    }
                }
            }
        }


    }
}

class Drink {
    /**
     * 价格
     */
    protected static double price = 0.00;

    /**
     * 容量
     */
    protected static double capacity = 0.00;


    public String toString()
    {
        return getClass() + "; 价格" + price + "元; 容量" + capacity + "ml;";
    }
}

class Coffee extends Drink {
    private boolean hasSugar = false;
    private boolean hasMilk = false;

    /**
     * 价格 元
     */
    protected static double price = 15.00;

    /**
     * 容量 ml
     */
    protected static double capacity = 150;

    public void addSugar () {
        this.hasSugar = true;
    }

    public void addMilk () {
        this.hasMilk = true;
    }

    public String toString()
    {
        String s = "咖啡";
        if (this.hasSugar) {
            s = s + "加糖";
        }
        if (this.hasMilk) {
            s = s + "加奶";
        }
        return s + "; 价格" + price + "元; 容量" + capacity + "ml;";
    }
}

class MineralWater extends Drink {

    /**
     * 价格 元
     */
    protected static double price = 2.00;

    /**
     * 容量 ml
     */
    protected static double capacity = 500;

    public String toString()
    {
        return "矿泉水" + "; 价格" + price + "元; 容量" + capacity + "ml;";
    }
}

class Coke extends Drink{

}

class CocaCola extends Coke{

    /**
     * 价格 元
     */
    protected static double price = 3.00;

    /**
     * 容量 ml
     */
    protected static double capacity = 280;

    public String toString()
    {
        return "可口可乐" + "; 价格" + price + "元; 容量" + capacity + "ml;";
    }

}

class Pepsi extends Coke{

    /**
     * 价格 元
     */
    protected static double price = 2.50;

    /**
     * 容量 ml
     */
    protected static double capacity = 280;

    public String toString()
    {
        return "百事" + "; 价格" + price + "元; 容量" + capacity + "ml;";
    }

}



