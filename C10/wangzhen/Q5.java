package C10;

import java.util.ArrayList;
import java.util.List;

/**
 * 5.  有如下Student 对象，包含三个属性姓名、年龄、分数，班号，
 *  　private String name;
 *     private int age;
 *     private int score;
 *     private String classNum;
 * 其中，classNum 表示学生的班号，例如“class05”。 创建集合并完成下列要求：
 * 1） 计算所有学生的平均年龄
 * 2） 计算各个班级的平均分
 */
public class Q5 {
    public static void main(String[] args) {
        List<StudentTwo> ListDemo= new ArrayList<>();

        StudentTwo A = new StudentTwo("Tom", 18, 100, "class05");
        StudentTwo B = new StudentTwo("Jerry", 22, 70, "class04");
        StudentTwo C = new StudentTwo("Owen", 25, 90, "class05");
        StudentTwo D = new StudentTwo("Jim", 30, 80, "class05");
        StudentTwo E = new StudentTwo("Steve", 28, 66, "class06");
        StudentTwo F = new StudentTwo("Kevin", 24, 100, "class04");

        ListDemo.add(A);
        ListDemo.add(B);
        ListDemo.add(C);
        ListDemo.add(D);
        ListDemo.add(E);
        ListDemo.add(F);

        //1） 计算所有学生的平均年龄
        Integer sumAge = 0;
        for (StudentTwo Somebody : ListDemo) {
            sumAge += Somebody.getAge();
        }
        Double avgAge = (double)sumAge / ListDemo.size();
        System.out.println("总年龄" + sumAge + "总人数" + ListDemo.size() + "平均年龄"+ avgAge); //24.5

        //2） 计算各个班级的平均分
        Double sumClass04 = 0.0;
        Double sumClass05 = 0.0;
        Double sumClass06 = 0.0;
        int count04 = 0;
        int count05 = 0;
        int count06 = 0;
        for (StudentTwo Somebody : ListDemo) {
            if (Somebody.getClassNum().equals("class04")) {
                sumClass04 += Somebody.getScore();
                count04++;
            }
            if (Somebody.getClassNum().equals("class05")) {
                sumClass05 += Somebody.getScore();
                count05++;
            }
            if (Somebody.getClassNum().equals("class06")) {
                sumClass06 += Somebody.getScore();
                count06++;
            }
        }

        //class04 平均分数：85.0class05 平均分数：90.0class06 平均分数：66.0
        System.out.println("class04 平均分数：" + sumClass04 / count04 + "class05 平均分数：" + sumClass05/count05 + "class06 平均分数："+ sumClass06/count06);
    }
}
