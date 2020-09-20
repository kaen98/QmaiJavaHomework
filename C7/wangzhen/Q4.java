package C7;

public class Q4 {
    public static void main(String[] args) {
        String s = "113@ ere qqq yyui";

        String [] arr = s.split("\\s+");
        for(String ss : arr){
            System.out.println(ss.replace("@", ""));
        }
    }
}
