/**
 * 请定义一个登录接口的业务处理类，并编写一个login方法，来模拟处理如下登录异常情况：
 * 1001-用户名或密码为空
 * 1002-用户名不存在
 * 1003-密码错误
 * 1004-此帐号已锁定
 */
public class Q5 {
    private static String localUserName = "zhaokai";
    private static String localPassWord = "123456";
    private static boolean isLock = false;

    public static void main(String[] args)
    {
        try {
//            boolean loginRst = Q5.login(null, null);
//            boolean loginRst = Q5.login("", "");
//            boolean loginRst = Q5.login("jim", "123");
//            boolean loginRst = Q5.login("zhaokai", "123");
            boolean loginRst = Q5.login("zhaokai", "123456");

            System.out.println("登录成功！");
        } catch (LoginException e) {
            System.out.println(e.getCode() + " - " + e.getMsg());
        }

    }

    public static boolean login(String userName, String passWord) throws LoginException
    {
        if (userName == null || passWord == null || "".equals(userName) || "".equals(passWord)) {
            throw new LoginException("用户名或密码为空", 1001);
        }
        if (!userName.equals(localUserName)) {
            throw new LoginException("用户名不存在", 1002);
        }
        if (!passWord.equals(localPassWord)) {
            throw new LoginException("密码错误", 1003);
        }
        if (!isLock) {
            throw new LoginException("此帐号已锁定", 1004);
        }

        return true;
    }
}

class LoginException extends Exception
{
    private String msg;
    private int code;

    public LoginException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg()
    {
        return this.msg;
    }

    public int getCode()
    {
        return this.code;
    }

}
