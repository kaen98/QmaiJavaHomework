package test02;

import java.lang.annotation.*;

/**
 * 自定义一个注解，该注解作用于类上，运行时可用，可以被记录到javadoc中
 *
 * @author san
 */
@Customize
public class TestClass {
    public static void main(String[] args) {


    }
}

/**
 * @author san
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Customize {

}

