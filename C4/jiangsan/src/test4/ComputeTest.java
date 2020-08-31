package test4;

/**
 * @author san
 */
public class ComputeTest {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        //Compute compute = new AddCompute();
        //Compute compute = new SubCompute();
        //Compute compute = new MulCompute();
        Compute compute = new DivCompute();

        UseCompute useCompute = new UseCompute(compute, a, b);
        int result = useCompute.show();
        System.out.println(result);
    }

}
