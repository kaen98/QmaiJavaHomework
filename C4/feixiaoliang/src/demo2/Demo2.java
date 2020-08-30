package demo2;

import java.util.Scanner;

/**
 * 编写程序实现软料购买：编写程序，接收用户输入的信息，选择购买的饮料。可供选择的饮料有：
 * 咖啡、矿泉水、可乐其中，购买
 * 咖啡时可以选择：加糖、加奶还是什么都不加。
 * 购买可乐时可以选择：买可口可乐还是百事可乐
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/29 2:23 下午
 */
public class Demo2 {
    public static void main(String[] args) {
        //饮料：咖啡、矿泉水和可乐
        //咖啡：加糖、加奶还是什么都不加
        //可乐：可口可乐、百事可乐
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择需要购买的饮料：1咖啡、2矿泉水、3可乐");
        String charge = "", x = scanner.next();
        Drinks drinks = new Drinks("饮料");
        switch (x) {
            //咖啡
            case "1":
                System.out.println("请选择需要购买的饮料：1加糖、2加奶、3什么都不加");
                String b = scanner.next();
                if ("1".equals(b)) {
                    charge = "加糖";
                } else if ("2".equals(b)) {
                    charge = "加奶";
                } else if ("3".equals(b)) {
                    charge = "什么都不加";
                }

                drinks = new Coffee("咖啡", charge);
                break;
            //矿泉水
            case "2":
                drinks = new Water("矿泉水");
                break;
            //可乐
            case "3":
                System.out.println("请选择需要购买的饮料：1可口、2百事");
                String c = scanner.next();
                if ("1".equals(c)) {
                    charge = "可口";
                } else if ("2".equals(c)) {
                    charge = "百事";
                }

                drinks = new Coke("可乐", charge);
                break;
            default:
                System.out.println("你的选择超过的宇宙边界！！");
                break;
        }

        drinks.buy();
    }
}
