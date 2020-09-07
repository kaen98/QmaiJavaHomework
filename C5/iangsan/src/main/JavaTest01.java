package main;

import java.io.IOException;

public class JavaTest01 {

    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}
