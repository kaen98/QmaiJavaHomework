package main.test03;

public class TestClass {

    public static <T> T change(Object o) {
        return (T) o;
    }

    public static void main(String[] args) {
        Object o = "test";
        String o2 = change(o);
        System.out.println(o2);
    }
}
