package LessonSeven;

public class exercisesThree {
    //"abcd23abcd34bcd"中，判断该字符串中是否包含"bc"子串。如果包含，求子串的所有出现位置
    public static void main(String[] args) {
        String string = "abcd23abcd34bcd";
        String findString = "bc";
        int index = 0;
        String strPosition = "bc位置出现再";
        while (true) {
            //indexOf——返回指定字符第一次出现的字符串内的索引
            int i = string.indexOf(findString, index);
            //找不到返回-1，循环结束
            if (i == -1) {
                break;
            }
            strPosition += i+",";
            index = i + findString.length();
        }
        System.out.println(strPosition.substring(0, strPosition.length()-1));
    }
}
