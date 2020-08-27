public class ThirdQ4PrimeNumber {
    public static void main(String[] args) {

        for (int i = 101; i < 201; i++) {
            printPrime(i);
        }
    }

    /**
     * 判断n是否是质数
     * @param n
     */
    public static void printPrime(int n){
        boolean isPrime=true;
        for(int i=n-1;i>1;i--){//n除以每个比n小比1大的自然数
            if(n%i==0){//如果有能被整除的，则不是质数
                isPrime=false;
            }
        }
        if(isPrime){//如果是质数，则打印出来
            System.out.print(n + " ");
        }
    }
}
