package classFive;
import java.util.Scanner;

public class exerciseFive {
    /**
     * 请定义一个登录接口的业务处理类，并编写一个login方法，来模拟处理如下登录异常情况：
     * 1001-用户名或密码为空
     * 1002-用户名不存在
     * 1003-密码错误
     * 1004-此帐号已锁定
     * @param args
     */
    public static String adminName = "Admin";
    public static String adminPwd = "Admin123";
    public static void main(String[] args) {
        try {
            login("Admin", "Admin123", false);
        }catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }


    private static void login(String userName, String passWord, boolean isLock) throws Exception {
        if(userName == null || passWord == null) {
            throw new Exception("请输入用户名密码");
        }

        if (!userName.equals(adminName)) {
            throw new Exception("用户名不存在");
        }

        if (!passWord.equals(adminPwd)) {
            throw new Exception("密码错误");
        }

        if(isLock) {
            throw new Exception("账号已被锁定");
        }
        System.out.println("用户登录成功");
    }
}
