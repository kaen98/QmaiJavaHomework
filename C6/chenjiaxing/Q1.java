package C6;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class Q1 {
    public static void main(String[] args) {
        //作业一 编写代码，使之导致java堆溢出，虚拟机栈溢出，方法区溢出，和本地内存溢出
        Memory a = new Memory();
        //a.one();
        //a.two();
        //a.three();
        a.four();
    }

}

class Memory{
    private static final int ONE_MB = 1024 * 1024;

    static ArrayList L;
    //java堆溢出
    public void one() {
        ArrayList list=new ArrayList();
        while(true)
        {
            list.add(new Obj());

        }
    }

    //虚拟机栈溢出
    public void two() {
        two();
    }

    //方法区溢出
    public void three() {
        List<String> list = new ArrayList<String>();

        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

    //本地内存溢出
    public void four() {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        try {
            Unsafe unsafe = (Unsafe) unsafeField.get(null);
            while (true) {
                unsafe.allocateMemory(ONE_MB);
            }
        }catch (Exception $e) {

        }
    }
}

class Obj{

}