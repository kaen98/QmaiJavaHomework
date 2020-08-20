/**
 * 阅读Integer内部类IntegerCache的源码
 *
 * @author San
 */
public class IntegerCacheDemo {


    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        Integer c = 128;
        Integer d = Integer.valueOf(128);


        System.out.println(a == b);//true
        System.out.println(c == d);//false
    }
}
