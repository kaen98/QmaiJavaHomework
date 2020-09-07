package demo5;

import java.util.Scanner;

/**
 * 请定义一个登录接口的业务处理类，并编写一个login方法，来模拟处理如下登录异常情况：
 * 1001-用户名或密码为空
 * 1002-用户名不存在
 * 1003-密码错误
 * 1004-此帐号已锁定
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/7 12:01 上午
 */
public class Demo5 {
    public static void main(String[] args) {
        System.out.println("请输入账号密码：");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try {
            login(i);
            System.out.println("登录成功");
        } catch (LoginException le) {
            System.out.println("LoginErrorCode" +
                    "message:'" + le.getMessage() + '\'' +
                    ", code:" + le.getErrorCode());
        }
    }

    public static void login(int i) throws LoginException {
        switch (i) {
            case 1:
                throw new LoginException(LoginErrorCode.USER_NAME_PASSWORD_IS_EMPTY);
            case 2:
                throw new LoginException(LoginErrorCode.USER_NAME_DOES_NOT_EXIST);
            case 3:
                throw new LoginException(LoginErrorCode.PASSWORD_MISTAKE);
            case 4:
                throw new LoginException(LoginErrorCode.THIS_ACCOUNT_HAS_BEEN_LOCK);
            default:
        }
    }
}
