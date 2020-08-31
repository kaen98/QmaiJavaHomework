package C4.Q4;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数");
        String one = input.next();

        String operator = checkOperators(input);

        String two = checkDivAndScenedNum(input, operator);

        UseCompute use = new UseCompute();

        System.out.println("计算结果：" + use.useCom(operator, Integer.parseInt(one), Integer.parseInt(two)));
    }

    /**
     * 检测运算符的输入
     * @param input
     * @return String
     */
    public static String checkOperators(Scanner input)
    {
        String[] operators = {"+","-", "*", "/"};

        System.out.println("请输入运算符：+ - * / ");
        String operator = input.next();

        if (!Arrays.asList(operators).contains(operator)) {
            System.out.println("错误的运算符:"+ operator);
            checkOperators(input);
        }
        return operator;
    }

    /**
     * 除法效验第二个数
     * @param input
     * @param operator
     * @return
     */
    public static String checkDivAndScenedNum(Scanner input, String operator)
    {
        System.out.println("请输入第二个数");
        String two = input.next();
        if ("/".equals(operator) && "0".equals(two)) {
            System.out.println("不能除以0");
            checkDivAndScenedNum(input, operator);
        }
        return two;
    }
}
