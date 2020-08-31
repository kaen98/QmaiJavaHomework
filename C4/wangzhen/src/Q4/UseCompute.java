package C4.Q4;

public class UseCompute {
    public int useCom(String operator, int one, int two)
    {
        Compute com = new Add();
        switch (operator) {
            case "-":
                com = new Minus();
                break;
            case "*":
                com = new Mul();
                break;
            case "/":
                com = new Div();
                break;
        }
        return com.computer(one, two);
    }
}
