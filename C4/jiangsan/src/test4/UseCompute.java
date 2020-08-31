package test4;

/**
 * @author san
 */
public class UseCompute {

    Compute compute;
    int a;
    int b;

    public UseCompute(Compute compute, int a, int b) {
        this.compute = compute;
        this.a = a;
        this.b = b;

    }

    public int show() {
        return this.compute.computer(this.a, this.b);
    }
}
