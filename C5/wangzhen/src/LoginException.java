package C5;

public class LoginException extends RuntimeException {

    private String code;

    public LoginException(String code) {
        this.code = code;
    }

    public LoginException(String code, Object message) {
        super(message.toString());
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
