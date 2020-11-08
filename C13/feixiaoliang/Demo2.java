import java.lang.annotation.*;

/**
 * 自定义一个注解，该注解作用于类上，运行时可用，可以被记录到javadoc中
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/11/8 11:16 下午
 */
@Check
public class Demo2 {
}

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Check {

}