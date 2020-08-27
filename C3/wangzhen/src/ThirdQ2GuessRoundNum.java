import java.util.Random;

public class ThirdQ2GuessRoundNum {
    public static void main(String[] args) {

        int guessNum = 666;//猜测的数字
        int num = 0;
        while (guessNum != num) {
            Random random = new Random();
            num = random.nextInt(1000);

            System.out.println("猜错了，继续猜"+num);
        }
        System.out.println("恭喜你，猜对了"+num);
    }
}
