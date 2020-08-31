/**
 * 4. 结合 static 和 final 关键字，利用接口做参数，写个计算器，能完成+ - * / 运算
 * （1）定义一个接口Compute含有一个方法int computer(int n,int m);
 *
 * （2）设计四个类分别实现此接口，完成 + - * / 运算
 *
 * （3）设计一个类UseCompute，含有方法：public void useCom(Compute com,int one,int two)
 *  此方法要求能够：
 *   1．用传递过来的对象调用computer方法完成运算
 *   2．输出运算的结果
 *
 * （4）设计一个测试类，调用UseCompute中的方法useCom来完成+ - * /运算
 */

public class Q4 {
    public static void main(String[] args) {
        UseCompute useCompute = new UseCompute();

        // success test
        assert 3 == useCompute.useCom(new Add(), 1, 2): "add error";
        assert 1 == useCompute.useCom(new Subtract(), 2, 1): "Subtract error";
        assert 2 == useCompute.useCom(new Multiply(), 1, 2): "Multiply error";
        assert 2 == useCompute.useCom(new Divide(), 2, 1): "Divide error";

        // error test
//        assert 1 == useCompute.useCom(new Add(), 1, 2): "add error";
//        assert 2 == useCompute.useCom(new Subtract(), 2, 1): "Subtract error";
//        assert 3 == useCompute.useCom(new Multiply(), 1, 2): "Multiply error";
//        assert 4 == useCompute.useCom(new Divide(), 2, 1): "Divide error";

        System.out.println("test ok");
    }
}

class UseCompute {
    public int useCom(Compute com, int one, int two) {
        return com.computer(one, two);
    }
}

interface Compute {
    public int computer(int n, int m);
}

class Add implements Compute {
    @Override
    public int computer(int n, int m) {
        return n + m;
    }
}

class Subtract implements Compute {
    @Override
    public int computer(int n, int m) {
        return n - m;
    }
}

class Multiply implements Compute {
    @Override
    public int computer(int n, int m) {
        return n * m;
    }
}

class Divide implements Compute {
    @Override
    public int computer(int n, int m) {
        return n / m;
    }
}
