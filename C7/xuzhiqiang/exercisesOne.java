package LessonSeven;

public class exercisesOne {
    public static void main(String[] args) {
        //统计一个字符串里面另一个字符串出现的次数，例如统计"monkey"在"I am monkey1024.monkey like banana.little monkey is smart."中出现的次数
        String string = "I am monkey1024.monkey like banana.little monkey is smart.";
        String findString = "monkey";
        //定义出现的次数
        int count = 0;

        //定义索引值
        int index = 0;

        while(string.indexOf(findString) != -1){
            index = string.indexOf(findString);
            count++;
            //将src截取子串
            string = string.substring(index + findString.length());
        }
        System.out.println("monkey出现的次数是：" + count);
    }
}
