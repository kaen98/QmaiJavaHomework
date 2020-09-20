package C7;

public class Q3 {
    public static void main(String[] args) {
        String s = "abcd23abcd34bcd";
        if (s.contains("bc")) {
            System.out.println("包含bc"+"出现位置");
            for(int i=-1; i<=s.lastIndexOf("bc");++i)
            {
                i=s.indexOf("bc",i);
                System.out.print(i+"\t");
            }
        } else {
            System.out.println("不包含bc");
        }
    }
}
