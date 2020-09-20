package C7;

public class Q1 {
    public static void main(String[] args) {
        String s = "I am monkey1024.monkey like banana.little monkey is smart.";
        String sub = "monkey";
        int filter = filter(s, sub);
        System.out.println(sub+"在字符串中出现了"+filter+"次");
    }

    public static int filter(String s,String sub){
        int old_length=s.length();
        String replace="";
        if (s.contains(sub)){
            replace = s.replace(sub, "");//将需要查找的字符串替换为空
        }
        int new_length= replace.length();//用原来字符串的长度去减替换过的字符串就是该字符串中字符出现的次数
        int count=(old_length-new_length)/(sub.length());//因为是字符串中字符出现的次数,所以要除以字符串你的长度最后就是字符串在另一个字符串中出现的次数
        return count;
    }

}
