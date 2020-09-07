package classFive;

public class exerciseThree {
    /**
     * 对于finally语句段中的代码一定会执行吗？请编写一段程序进行验证
     * <p>
     * 回答：
     * 1）在try之前就执行了return 如：try之前有异常或则在try有return finally将不再执行
     * 2）在try代码运行是，终止了代码的执行，finally也不继续执行
     */
    public static void main(String[] args) {
        System.out.println("执行方法1：" + myMethodOne());
        System.out.println("执行方法1：" + myMethodTwo());
        System.out.println("执行方法1：" + myMethodThree());
    }

    public static int myMethodOne() {
//        ArrayIndexOutOfBoundsException 抛出运行是异常，不继续执行后，finally将不再执行不执行
        int i = 0;
        int[] num = { 1, 2, 3 };

        System.out.println(num[3]);

        try {
            System.out.println("try 代码块被执行！");
            return 0;
        } catch (Exception e) {
            System.out.println("catch 代码块被执行！");
            return 0;
        } finally {
            System.out.println("finally 代码块被执行！");
            return 0;
        }
    }

    public static int myMethodTwo() {
        //在try执行钱已经return finally不再执行
        if (1 < 2) {
            return 1;
        }

        try {
            System.out.println("try 代码块被执行！");
            return 0;
        } catch (Exception e) {
            System.out.println("catch 代码块被执行！");
            return 0;
        } finally {
            System.out.println("finally 代码块被执行！");
            return 0;
        }
    }

    public static int myMethodThree() {
        //在try代码块中执行System.exit(0); finally也将不再执行
        try {
            System.out.println("try 代码块被执行！");
            System.exit(0);
            return 0;
        } catch (Exception e) {
            System.out.println("catch 代码块被执行！");
            return 0;
        } finally {
            System.out.println("finally 代码块被执行！");
            return 0;
        }
    }
}

