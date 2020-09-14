package main.excption;


/**
 * @author san
 */
public class BizException extends RuntimeException {

    private String message;
    private String code;

    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;

    }
}
