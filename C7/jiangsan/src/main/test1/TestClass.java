package main.test1;

/**
 * 统计一个字符串里面另一个字符串出现的次数，例如统计"monkey"在"I am monkey1024.monkey like banana.little monkey is smart."中出现的次数
 *
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {
        String find = "monkey";
        String str = "I am monkey1024.monkey like banana.little monkey is smart.";

        int index = 0;
        int num = 0;

        while ((index = str.indexOf(find, index)) != -1) {
            index++;
            num++;
        }

        System.out.println(find + "字符串出现了：" + num + "次");
    }
}
