/**
 * 字符串可以直接用加号进行拼接，但是也有几种不同的情况. 以下不同情况的拼接,分别创建了几个对象?
 * 1） String str = "hello" + "world";
 * 2）String str1 = "hello";   String str2 = str1 + "world";
 * 3）String str1 = new String("hello"); String str2 = str1 + "world";
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/21 1:51 上午
 */
public class Demo5 {
    public static void main(String[] args){
        //常量池中创建了helloworld，创建了一个常量池对象
        String str = "hello" + "world";

        //常量池中创建了hello，helloworld，创建了两个常量池对象
        String str1 = "hello";
        String str2 = str1 + "world";

        //hello、helloworld两个常量池变量，创建了两个常量池对象，一个对象引用赋值
        String str3 = new String("hello");
        String str4 = str3 + "world";
    }
}
