package C7;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class Q1 {
    public static void main(String[] args) {
      //第一题 统计monkey 在I am monkey1024.monkey like banana.little monkey is smart.出现的次数
        sumStr("I am monkey1024.monkey like banana.little monkey is smart.", "monkey");
    }

    public static void sumStr(String str, String str1) {
        int count = 0;
        while(str.indexOf(str1)>=0) {
            str=str.substring(str.indexOf(str1)+str1.length());
            count++;
        }
        System.out.println("指定字符串在原字符串中出现："+count+"次");
    }
}
