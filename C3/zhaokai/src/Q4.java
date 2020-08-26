import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i = 101; i <= 200; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        System.out.println(primeList.size());
        System.out.println(primeList);
    }

    public static boolean isPrime(int n) {
        if (1 < n && n <= 3) {
            return true;
        }
        for(int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
