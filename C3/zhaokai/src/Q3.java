import java.time.LocalDateTime;
import java.util.Timer;

public class Q3
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("程序开始时间：" + now.toString());

        // 延迟30s后， 终止程序
        (new Timer()).schedule(new Stop(), 30000);
        while (true) {

        }

    }
}
