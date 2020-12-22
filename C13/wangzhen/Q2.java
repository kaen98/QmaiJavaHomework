import java.lang.annotation.*;

/**
 * 2.自定义一个注解，该注解作用于类上，运行时可用，可以被记录到javadoc中
 */
@Q2
class Q2Run {

}

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Q2 {

}


