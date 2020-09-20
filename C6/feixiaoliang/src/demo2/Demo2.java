package demo2;

import demo1.Foods;
import demo1.Json;

/**
 * 创建一个实体类，覆写toString()方法使之输出json格式字符串
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/9/20 9:32 下午
 */
public class Demo2 {
    public static void main(String[] args){
        Json json = new Json(new Foods());
        System.out.println(json);
    }
}
