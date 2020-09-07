package demo5;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/7 12:50 上午
 */
public enum LoginErrorCode {
    /**
     * 错误类型
     */
    USER_NAME_PASSWORD_IS_EMPTY("用户名或密码为空", 1001),
    USER_NAME_DOES_NOT_EXIST("用户名不存在", 1002),
    PASSWORD_MISTAKE("密码错误", 1003),
    THIS_ACCOUNT_HAS_BEEN_LOCK("此帐号已锁定", 1004);

    private String message;
    private int code;

    LoginErrorCode(String message, int code){
        this.message = message;
        this.code = code;
    }

    public static int getByCode(String message){
        for (LoginErrorCode code:LoginErrorCode.values()){
            if(message.equals(code.getMessage())){
                return code.getCode();
            }
        }

        return 0;
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
