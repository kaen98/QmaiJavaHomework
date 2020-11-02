package xuzhiqiang;

import java.lang.annotation.*;

@questionTwo
class testQuestionTwo {
    /**
     * 自定义一个注解，该注解作用于类上，运行时可用，可以被记录到javadoc中
     * @param args
     */
    public static void main(String[] args) {


    }
}


@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface  questionTwo {

}


