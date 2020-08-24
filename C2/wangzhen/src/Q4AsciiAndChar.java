public class Q4AsciiAndChar {
    public static void main(String[] args) {
        char str = 'y';
        int asc = 0x0079;
        System.out.println(charToAsc(str));
        System.out.println(ascToChar(asc));

    }

    public static int charToAsc(char str) {
        return (int) str;
    }

    public static char ascToChar(int asc) {
        return (char) asc;
    }
}
