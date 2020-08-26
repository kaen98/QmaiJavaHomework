import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TimerTask;

public class Stop extends TimerTask {
    @Override
    public void run() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("程序终止时间：" + now.toString());
        System.exit(0);
    }
}
