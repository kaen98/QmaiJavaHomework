public class ThirdQ5MulTable {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < x+1; y++) {
                System.out.print(y+"*"+x+"="+ x*y + "  ");
            }
            System.out.println();
        }
    }
}
