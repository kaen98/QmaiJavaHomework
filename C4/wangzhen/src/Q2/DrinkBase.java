package C4.Q2;

import java.util.Scanner;

public class DrinkBase extends Drink {
    @Override
    String buy() {
        return "购买的是饮料";
    }

    @Override
    String choice() {
        return "可供选择的饮料有：A：咖啡；B：矿泉水；C：可乐；请输入选择。";
    }

}
