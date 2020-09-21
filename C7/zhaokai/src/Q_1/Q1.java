package Q_1;

/**
 * 1.  统计一个字符串里面另一个字符串出现的次数，例如统计"monkey"在"I am monkey1024.monkey like banana.little monkey is smart."中出现的次数.
 */
public class Q1 {
    public static void main(String[] args) {
        String demoString = "I am monkey1024.monkey like banana.little monkey is smart.";
        String[] list = demoString.split("monkey");
        int count = list.length - 1;
        System.out.println("monkey 出现次数有：" + count + "次");
    }
}
