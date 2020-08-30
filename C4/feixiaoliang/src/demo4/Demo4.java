package demo4;

import java.util.Scanner;

/**
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/8/30 4:30 下午
 */
public class Demo4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数");
        String one = input.next();
        System.out.println("请输入运算符：+ - * / ");
        String operator = input.next();
        System.out.println("请输入第二个数");
        String two = input.next();

        Compute compute = null;
        UseCompute useCompute = new UseCompute();
        switch (operator) {
            case "+":
                compute = new Addition();
                break;
            case "-":
                compute = new Subtraction();
                break;
            case "*":
                compute = new Multiplication();
                break;
            case "/":
                if ("0".equals(two)) {
                    System.out.println("警告，分母不能为0！");
                } else {
                    compute = new Division();
                }
                break;
            default:
                System.out.println("错误的运算符");
                break;
        }

        if (compute != null) {
            useCompute.useCom(compute, Integer.parseInt(one), Integer.parseInt(two));
        }
    }
}
