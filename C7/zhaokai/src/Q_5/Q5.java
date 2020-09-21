package Q_5;

/**
 * 5. 字符串可以直接用加号进行拼接，但是也有几种不同的情况. 以下不同情况的拼接,分别创建了几个对象?
 * 1）String str = "hello" + "world";
 * 答：jvm编译期优化, 在常量池中只创建一个对象 ""helloworld""，
 *
 * 2）String str1 = "hello";   String str2 = str1 + "world";
 * 答：
 * String str1 = "hello";  // 常量池创建一个对象 "hello"
 * String str2 = str1 + "world";  // 常量池， 先创建一个 "world"； 然后在常量池再创建一个 "helloworld"； 然后在堆中创建 "helloworld"堆对象，并指向常量池
 * 所以：
 * 常量池中， "hello"， "world"， "helloworld"
 * 堆中， "helloworld"
 *
 * 3）String str1 = new String("hello"); String str2 = str1 + "world";
 * 答：
 * String str1 = new String("hello"); // 常量池，"hello"对象； 堆中， "hello"堆对象并指向常量池
 * String str2 = str1 + "world"; // 常量池， "world" 对象；然后， 字符串拼接，常量池中再增加 "helloworld"； 并在堆中， 生成 "helloworld"堆对象， 并指向常量池
 * 所以：
 * 常量池中， "hello"， "world"， "helloworld"
 * 堆中，"helloworld"
 */
public class Q5 {

}
