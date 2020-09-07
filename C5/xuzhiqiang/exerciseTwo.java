package classFive;

public class exerciseTwo {
    /**
     * 捕获异常代码块中，只有try/finally语句而没有catch语句是否可以，请编写一段函数加以验证
     * @param args
     */
    public static void main(String[] args) {
        //在tyr里面没有抛出异常时，try和finally正常被执行
        try {
            System.out.println("执行try语句");
        }

        finally {
            System.out.println("执行finally语句");
        }

        //在try里面抛出了异常，finally将不能执行，程序报错
//        try{
//            throw new Exception("抛出异常");
//        }
//
//        finally {
//            System.out.println("执行finally语句");
//        }
    }
}
