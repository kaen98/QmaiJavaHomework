package classSeven;

import java.text.ParseException;

public class test5 {
    public static void main(String[] strings) throws ParseException {
        ToolTest5 test5 = new  ToolTest5();
        //获取当前时间戳（秒）
        System.out.println(test5.timestamp());
        //获取当前时间，yyyy-MM-dd HH:mm:ss格式的字符串
        System.out.println(test5.stringTime());
        //Date转yyyy-MM-dd HH:mm:ss格式的字符串
        System.out.println(test5.dateToString());
        //任意字符串转Date
        System.out.println(test5.stringToData("2020-09-24 22:09:23"));
    }

}
