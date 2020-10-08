package C6.Q1;

import sun.misc.Unsafe;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
public class Demo {

    private static int num =1;

    public void main(String[] strings) throws Exception {
        //堆溢出
        testHeapOverFlow();
        //栈溢出
        testStackOverFlow();
        //本机内存溢出
        testLocalOverFlow();
        //方法区溢出
        testFunAreaOverFlow();
    }

    //堆溢出
    public static void testHeapOverFlow() {
        List<byte[]> list = new ArrayList<>();
        int i=0;
        while (true){
            list.add(new byte[5*1024*1024]);
            System.out.println("count is: "+(++i));
        }
    }


    public void testStackOverFlow() { //栈溢出
        num++;
        this.testStackOverFlow();
    }

    //本机内存溢出
    private static final int _1MB = 1024 * 1024;
    public static void testLocalOverFlow() throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }


    //方法区溢出
    public static void testFunAreaOverFlow() {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
