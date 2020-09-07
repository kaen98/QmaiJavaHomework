package classFive;

public class exercisesOne {
    /**
     * 请写一段示例代码，演示如何在一个方法中捕获多个异常类型
     * @param args
     */
    public static void main(String[] args) {
        try{
            int aIntPrim = Integer.parseInt("two");
            System.out.println("代码运行结束");

        } catch (NumberFormatException numRec) {
            System.out.println("数字类型转化异常");
        } catch (Exception exc) {
            System.out.println("业务错误异常"+exc.getMessage());
        }
    }
}
