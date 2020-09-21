package LessonSeven;

public class exercisesTwo {
    //编写程序将 “jdk” 全部变为大写,然后截取子串”DK”
    public static void main(String[] args){
            String string="jdk";
            String upperString=string.toUpperCase();//将小写字母转换为大写字母
            System.out.println(upperString);
            System.out.println(upperString.substring(1));//截取子串”DK” 并输出到屏幕
    }
}
