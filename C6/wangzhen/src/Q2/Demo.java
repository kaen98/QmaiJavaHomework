package C6.Q2;

public class Demo {
    public static void main(String[] strings){
        CoverToString coverToString = new CoverToString();
        coverToString.name = "王";
        coverToString.age = 25;
        coverToString.company = "XXXX";
        String str = coverToString.toString();
        System.out.println(str);
    }
}
