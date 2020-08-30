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

        Compute compute;
        UseCompute useCompute = new UseCompute();
        switch (operator) {
            case "+":
                compute = new Addition();
                useCompute.useCom(compute, Integer.parseInt(one), Integer.parseInt(two));
                break;
            case "-":
                compute = new Subtraction();
                useCompute.useCom(compute, Integer.parseInt(one), Integer.parseInt(two));
                break;
            case "*":
                compute = new Multiplication();
                useCompute.useCom(compute, Integer.parseInt(one), Integer.parseInt(two));
                break;
            case "/":
                compute = new Division();
                useCompute.useCom(compute, Integer.parseInt(one), Integer.parseInt(two));
                break;
            default:
                System.out.println("错误的运算符");
                break;
        }
    }
}
