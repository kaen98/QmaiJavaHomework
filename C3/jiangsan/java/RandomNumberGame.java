import java.util.Random;
import java.util.Scanner;

/**
 * 写一段程序代码，利用Random类生成1个1000以内的随机数字，猜出这个数字
 *
 * @author San
 */
public class RandomNumberGame {

    private static final int HAPPY_ENDING = 8861;

    public static void guessNumber(int randomNum) {
        System.out.println("===============请输入你猜的数字，【不想玩的话输入8861】===============");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()) {
                int anInt = scanner.nextInt();

                if (anInt == randomNum) {
                    System.out.println("这么厉害，你猜对了、、、、、");
                    break;
                }

                if (anInt == HAPPY_ENDING) {
                    break;
                }

                if (anInt < randomNum) {
                    System.out.printf("这个数比你猜的要大，你猜的数：%d，随机数：%d \n", anInt, randomNum);
                } else {
                    System.out.printf("这个数比你猜的要小，你猜的数：%d，随机数：%d \n", anInt, randomNum);
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("===============这个数字在1000以内===============");

        Random random = new Random();
        int anInt = random.nextInt(1000);

        guessNumber(anInt);

        System.out.println("===============游戏结束 Happy Ending===============");

    }
}
