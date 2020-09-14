package main;

/**
 * @author san
 */
public class JavaTest02 {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("RuntimeException");
        }
    }
}
