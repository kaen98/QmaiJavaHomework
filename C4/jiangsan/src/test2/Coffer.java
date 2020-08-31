package test2;

/**
 * @author san
 */
public class Coffer extends Drink {
    public void feed(int a) {
        switch (a) {
            case 11:
                System.out.println("加糖了~");
                break;
            case 12:
                System.out.println("加奶了~");
                break;
            default:
                System.out.println("什么都没加的咖啡");
                break;
        }
    }
}
