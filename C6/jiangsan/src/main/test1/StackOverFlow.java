package main.test1;

/**
 * @author san
 */
public class StackOverFlow {

    private int count;

    public void deadLoop() {
        count++;
        deadLoop();
    }

    public static void main(String[] args) {
        System.out.println("HelloStackOverFlow");
        StackOverFlow flow = new StackOverFlow();

        try {
            flow.deadLoop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
