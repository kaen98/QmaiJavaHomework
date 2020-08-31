package main;

import test1.Round;
import test1.Triangle;
import test2.*;

import java.util.Scanner;

/**
 * @author san
 */
public class HomeWork {

    public static void main(String[] args) {
        //test1 求不同图形的周长
        double a = 2.5;
        Round round = new Round(a);
        round.perimeter();

        double a1 = 1;
        double a2 = 2;
        double a3 = 3;
        Triangle triangle = new Triangle(a1, a2, a3);
        triangle.perimeter();

        //2 饮料选择
        System.out.println("======请选择你需要的饮料======");
        System.out.println("======1.咖啡======");
        System.out.println("======2.矿泉水======");
        System.out.println("======3.可乐======");
        System.out.println("======4.退出======");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("======请选择你需要加糖、加奶还是什么都不加======");
                    System.out.println("======21.加糖======");
                    System.out.println("======22.加奶======");
                    System.out.println("======23.什么都不加======");

                    Scanner scanner2 = new Scanner(System.in);
                    int choose2 = scanner2.nextInt();
                    Coffer coffer = new Coffer();
                    coffer.feed(choose2);
                    break;
                case 2:
                    Drink drink = new Water();
                    drink.feed();
                    break;
                case 3:
                    System.out.println("======请选择你需要的可乐类型======");
                    System.out.println("======31.加糖========");
                    System.out.println("======32.加糖======");

                    Scanner scanner3 = new Scanner(System.in);
                    int choose3 = scanner3.nextInt();
                    if (choose3 == 31) {
                        Drink drink1 = new Pepsi();
                        drink1.feed();
                    } else {
                        Drink drink2 = new CocaCola();
                        drink2.feed();
                    }
                    break;
                default:
                    System.out.println("拜拜了您嘞~");
                    break;
            }
        }
    }
}
