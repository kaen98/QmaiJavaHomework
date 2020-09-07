package classFive;

public class exerciseFour {
    /**
     * throw和throws的区别是什么？请写一段程序加以说明
     * @param args
     *
     * throw  出现在函数体  throw则是抛出了异常，执行throw则一定抛出了某种异常对象
     * throws 当某个方法可能会抛出某种异常时用于throws 声明可能抛出的异常，然后交给上层调用它的方法程序处理 出现在方法函数头
     */
    public static void main(String[] args) {
        try{
//            test2();
            throw new Exception("正常throw异常抛出");
        }  catch (NumberFormatException numExc) {
            System.out.println("数据类型强制转换错误");
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void test2() throws NumberFormatException {
        int aIntPrim = Integer.parseInt("two");
        System.out.println("throws错误执行");
    }
}
