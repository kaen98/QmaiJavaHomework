package xuzhiqiang;

public class questionThree {
    /**
     *编写一个泛型方法，使之能自动将Object类型转换成其他类型
     * @param args
     */
    public static void main(String[] args) {
        Object o = new test();
        autoConvert(o);
        System.out.println(o);
    }

    private static <T> T autoConvert(Object obj){
        return (T)obj;
    }
}

class test {

}
