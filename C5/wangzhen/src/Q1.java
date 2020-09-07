package C5;

import java.io.File;

public class Q1 {
    public static void main(String[] args)
    {
        try {
            throw new IndexOutOfBoundsException("报错IndexOutOfBoundsException");
//            throw new IllegalArgumentException("报错IllegalArgumentException");
//            throw new NullPointerException("报错NullPointerException");
//            throw new RuntimeException("报错RuntimeException");
        } catch (IndexOutOfBoundsException ext) {
            System.out.println(ext.getMessage());
        } catch (IllegalArgumentException ext) {
            System.out.println(ext.getMessage());
        } catch (NullPointerException ext) {
            System.out.println(ext.getMessage());
        } catch (RuntimeException ext) {
            System.out.println(ext.getMessage());
        }

    }
}
