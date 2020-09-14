package main;

import java.io.IOException;

/**
 * @author san
 */
public class JavaTest04 {

    public void test1() throws IOException {
        System.out.println("test1");
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {

        JavaTest04 javaTest04 = new JavaTest04();
        javaTest04.test1();
    }
}
