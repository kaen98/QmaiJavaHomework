package C7;

public class Q5 {
    public static void main(String[] args) {
        String str = "hello" + "world";
        System.out.println("直接返回常量池中本次创建的对象，创建了1个对象");

        String str1 = "hello";
        String str2 = str1 + "world";
        System.out.println("创建了2个常量池对象");

        String str3 = new String("hello");
        String str4 = str3 + "world";
        System.out.println("创建了2个常量池对象+1堆对象引用");
    }
}
