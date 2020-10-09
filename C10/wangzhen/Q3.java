package C10;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. 定义一个学生类Student，包含三个属性姓名name、年龄age、性别gender，创建三个学生对象存入ArrayList集合中。
 * 姓名 年龄  性别
 * 张三   20  男
 * 李希  39   男
 * 小七  18   女
 *   1）：遍历集合遍历输出。
 *   2）：求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃。
 */
public class Q3 {
    public static void main(String[] args) {
        List<Student> ListDemo= new ArrayList<>();

        Student A = new Student("张三", 20, "男");
        Student B = new Student("李希", 39, "男");
        Student C = new Student("小七", 18, "女");

        ListDemo.add(A);
        ListDemo.add(B);
        ListDemo.add(C);
        //1）：遍历集合遍历输出。
        for (Student Somebody : ListDemo) {
            System.out.println(Somebody.toString());
        }

        //2）：求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃。
        Integer oldestIndex = 0; //年龄最大的索引
        Integer oldestAge   = 0; //年龄最大的值

        for (Student Somebody : ListDemo) {
            if (Somebody.age > oldestAge) {
                oldestAge = Somebody.age;
                oldestIndex = ListDemo.indexOf(Somebody);
            }
        }
        System.out.println("oldestIndex" + oldestIndex + " oldestAge" + oldestAge);

        Student oldest = ListDemo.get(oldestIndex);
        oldest.name = "葫芦娃";
        ListDemo.set(oldestIndex, oldest);

        //最后输出
        for (Student Somebody : ListDemo) {
            System.out.println(Somebody.toString());
        }
    }
}
