package main;

import main.excption.BizException;

/**
 * @author san
 */
public class JavaTest05 {

    public static void userLogin(String password, String account) throws BizException {

        if (password == null || account == null) {
            throw new BizException("1001", "用户名或密码为空");
        }

        if ("xxxx".equals(account)) {
            throw new BizException("1002", "用户名不存在");
        }

        if (!"111111".equals(password)) {
            throw new BizException("1003", "密码不正确");
        }

        if ("jiangsan".equals(account)) {
            throw new BizException("1004", "此帐号已锁定");
        }
    }

    public static void main(String[] args) {
        userLogin("123456", "jiangsan");
    }
}
