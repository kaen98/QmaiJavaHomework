public class Q2RedAndTry {
    public static void main(String[] args) {
        //随机生成-128 127 数字
        int roundInNum = (int) (Math.random()*(127- -128+1)+ -128);
        //范围外
        int roundOutNum = (int) (Math.random()*(9999- 128+1)+ 128);
        System.out.println(roundInNum);
        Integer a = roundInNum;
        Integer b = Integer.valueOf(roundInNum);

        Integer A = roundOutNum;
        Integer B = Integer.valueOf(roundOutNum);

        String word1;
        String word2;
        if (a == b) {
            word1 = "我们都一样";
        } else {
            word1 = "我们不一样";
        }

        if (A == B) {
            word2 = "我们都一样";
        } else {
            word2 = "我们不一样";
        }
        System.out.println(" -128 - 127 之间 ：" + word1);
        System.out.println("之外的数字 包装类  ：" + word2);
    }
}
