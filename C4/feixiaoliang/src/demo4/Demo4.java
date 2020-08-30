package demo4;

import java.util.ArrayList;
import java.util.List;
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

        boolean isCompute = false;
        UseCompute useCompute = new UseCompute();

        List<Compute> computeList = new ArrayList<>();
        computeList.add(new Addition());
        computeList.add(new Subtraction());
        computeList.add(new Multiplication());
        computeList.add(new Division());

        for (Compute compute:computeList){
            if("/".equals(operator) && "0".equals(two)){
                System.out.println("警告，分母不能为0！");
                break;
            }

            if(operator.equals(compute.getOperator())){
                isCompute = true;
                useCompute.useCom(compute, Integer.parseInt(one), Integer.parseInt(two));
            }
        }

        if (!isCompute) {
            System.out.println("错误的运算符");
        }
    }
}
