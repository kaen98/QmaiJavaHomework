package demo5;

/**
 * 登录异常类
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/7 12:27 上午
 */
public class LoginException extends Exception{

    private int errorCode;

    public LoginException(LoginErrorCode loginErrorCode){
        super(loginErrorCode.getMessage());
        this.errorCode = loginErrorCode.getCode();
    }

    public int getErrorCode() {
        return errorCode;
    }
}
