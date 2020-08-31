package classThree.Two;

import java.util.Scanner;

public class Store {
    public static void main(String[] strings) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择饮料：1.咖啡；2.矿泉水；3.可乐");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("请问是否需要添加配料：1.加糖；2.加奶；3.什么都不加");
                int n = sc.nextInt();
                if(n == 1) {
                    Drinks d = new Coffee();
                    d.setDrinkName("咖啡");
                    d.SetFeeding("加糖");
                    d.show();
                } else if(n == 2) {
                    Drinks d = new Coffee();
                    d.setDrinkName("咖啡");
                    d.SetFeeding("加奶");
                    d.show();
                } else {
                    Drinks d = new Coffee();
                    d.setDrinkName("咖啡");
                    d.SetFeeding("什么都不加");
                    d.show();
                }
                break;
            case 2:
                Drinks d = new Water();
                d.setDrinkName("矿泉水");
                d.show();
                break;
            case 3:
                System.out.println("请问是否需要添加配料：1.可口可乐；2.百事可乐");
                int b = sc.nextInt();
                Drinks e = new Cola();
                e.setDrinkName("可乐");
                if(b == 1) {
                    e.SetFeeding("可口可乐");
                    e.show();
                } else  {
                    e.SetFeeding("百事可乐");
                    e.show();
                }
                break;
        }
    }
}
