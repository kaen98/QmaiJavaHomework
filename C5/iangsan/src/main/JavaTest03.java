package main;

public class JavaTest03 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException--catch");
        } finally {
            System.out.println("RuntimeException--finally");
        }
    }
}
