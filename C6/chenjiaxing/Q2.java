package C6;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class Q2 {
    public static void main(String[] args) {
        //作业二 复写toString 输出json字符
        Obj2 a = new Obj2();
        System.out.println(a.toString());;
    }
}

class Obj2{
    public int status = 1;
    public String message = "操作成功";
    public String toString(){
        return "{\"message\":\"" + message + "\",\"status\":" + status+ "\"}";
    }
}