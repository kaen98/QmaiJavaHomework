package C5;

public class Q2 {
    public static void main(String[] args){
        try {
            System.out.println("行不行");
            throw new RuntimeException("报错报错");
        } finally {
            System.out.println("行不行？？？");
        }
//        try {
//            System.out.println("总行了吧");
//            throw new RuntimeException("报错报错");
//        } catch (RuntimeException ext) {
//            System.out.println(ext.getMessage());
//        } finally {
//            System.out.println("总行了吧！！！");
//        }

        //TODO::结论，有try 和 finally 并不能捕获异常
    }
}
