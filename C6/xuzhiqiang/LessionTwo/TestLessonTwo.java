package classSix.LessionTwo;


public class TestLessonTwo {
    public static void main(String[] strings){
        CoverToString coverToString = new CoverToString();
        coverToString.name = "王二";
        coverToString.age = 20;
        coverToString.company = "网络科技";
        String str = coverToString.toString();
        System.out.println(str);
    }
}
