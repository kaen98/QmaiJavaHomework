package LessonSeven;

public class exerciseFour {
    public static void main(String[] args) {
        String string = "113@ ere qqq yyui";
        String replaceString = string.replaceAll("@", "");
        String [] ss=replaceString.split(" ");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
