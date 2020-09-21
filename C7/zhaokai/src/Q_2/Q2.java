package Q_2;

/**
 * 2.  编写程序将 “jdk” 全部变为大写,然后截取子串”DK”
 */
public class Q2 {
    public static void main(String[] args) {
        String demoJDK = "jdk".toUpperCase();
        String demoDK = demoJDK.substring(1);

        System.out.println("jdk 转大写：" + demoJDK);
        System.out.println("然后截取子串'DK'：" + demoDK);
    }
}
