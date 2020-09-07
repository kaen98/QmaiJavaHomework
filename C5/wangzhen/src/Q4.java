package C5;

import java.io.FileReader;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        try {
            throwsException(1);
            throwsException(2);
        } catch (IOException ext) {
            System.out.println(ext.getMessage());
        }
        //TODO::结论： throws是向上抛出异常,引用地方必须处理这类异常，throw是直接抛出异常
    }

    public static void throwsException(int type) throws IOException
    {
        FileReader file = new  FileReader("app/config.php");
        if (type == 1){
            throw new NumberFormatException("NumberFormatException");
        } else {
            throw new NullPointerException("NullPointerException");
        }
    }
}
