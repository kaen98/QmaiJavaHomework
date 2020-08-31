package C4.Q2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Drink drink = new DrinkBase();
        Drink drink2 = checkChoice(input, drink);
        Drink drink3 = checkChoice(input, drink2);
        System.out.println(drink3.buy());

    }

    public static Drink checkChoice(Scanner input, Drink drink) {
        System.out.println(drink.choice());

        String one = input.next();

        if (drink instanceof DrinkBase) {
            if (!("A".equals(one) || "B".equals(one) || "C".equals(one))) {
                System.out.println("其他饮料暂未提供，请重新选择");
                checkChoice(input, drink);
            }

            switch(one) {
                case "A":
                    drink = new Coffee();
                    break;
                case "B":
                    drink = new MineralWater();
                    break;
                case "C":
                    drink = new Cola();
                    break;
            }
        } else if (drink instanceof Cola) {
            if (!("A".equals(one) || "B".equals(one))) {
                System.out.println("其他可乐暂未提供，请重新选择");
                checkChoice(input, drink);
            }

            switch(one) {
                case "A":
                    drink = new CocaCola();
                    break;
                case "B":
                    drink = new PepsiCola();
                    break;
            }
        } else if (drink instanceof Coffee) {
            if (!("A".equals(one) || "B".equals(one))) {
                System.out.println("其他可乐暂未提供，请重新选择");
                checkChoice(input, drink);
            }
            Coffee drink2 = (Coffee)drink;
            drink2.setZuofa(one);

            return drink2;
        }

        return drink;
    }
}
