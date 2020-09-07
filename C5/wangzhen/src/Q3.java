package C5;

public class Q3 {

    public static void main(String[] args){
        String word = "我是初";
        try {
            word = "我是try";
            throw new RuntimeException("报错报错");
        } catch (RuntimeException ext) {
            //
        } finally {
            word = "我是finally";
        }
        System.out.println(word);//我是finally

        //TODO::结论，finally语句段中的代码一定会执行
    }
}
