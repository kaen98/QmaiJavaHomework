package src;

import com.sun.xml.internal.xsom.impl.scd.Step;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * 有如下Student 对象，包含三个属性姓名、年龄、分数，班号，
 * private String name;
 * private int age;
 * private int score;
 * private String classNum;
 * 其中，classNum 表示学生的班号，例如“class05”。 创建集合并完成下列要求：
 * 1） 计算所有学生的平均年龄
 * 2） 计算各个班级的平均分
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/7 10:29 下午
 */
public class Demo5 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tom", 18, 100, "class05"));
        studentList.add(new Student("Jerry", 22, 70, "class04"));
        studentList.add(new Student("Owen", 25, 90, "class05"));
        studentList.add(new Student("Jim", 30, 80, "class05"));
        studentList.add(new Student("Steve", 28, 66, "class06"));
        studentList.add(new Student("Kevin", 24, 100, "class04"));
        print(studentList);

        int avgAge = avgAge(studentList);
        System.out.println("所有学生平均年龄：" + avgAge);

        avgClassScore(studentList);
    }

    /**
     * 计算各个班级的平均分
     *
     * @param list
     * @return
     */
    public static void avgClassScore(List<Student> list) {
        Map<String, ArrayList<Integer>> classMap = new HashMap<>();
        ArrayList<Integer> classScore;
        for (Student std : list) {
            classScore = classMap.get(std.getClassNum());

            if (classScore == null) {
                classScore = new ArrayList<>();
            }

            classScore.add(std.getScore());

            classMap.put(std.getClassNum(), classScore);
        }

        for (String classNum : classMap.keySet()) {
            classScore = classMap.get(classNum);
            int scoreCount = 0;
            for (Integer score : classScore) {
                scoreCount += score;
            }

            int avgScore = scoreCount / classScore.size();

            System.out.println(classNum + " 班平均分：" + avgScore);
        }
    }

    /**
     * 计算所有学生平均年龄
     *
     * @param studentList 所有学生集合
     * @return 平均年龄
     */
    public static int avgAge(List<Student> studentList) {
        int count = studentList.size();
        int age = 0;
        for (int i = 0; i < count; i++) {
            age += studentList.get(i).getAge();
        }

        return age / count;
    }

    public static void print(List<Student> list) {
        //打印
        for (Student student : list) {
            System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge() + " 分数：" + student.getScore() + " 班号：" + student.getClassNum());
        }

        System.out.println("===================================================");
    }

    static class Student {
        private String name;
        private int age;
        private int score;
        private String classNum;

        public Student(String name, int age, int score, String classNum) {
            setName(name);
            setAge(age);
            setScore(score);
            setClassNum(classNum);
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String getClassNum() {
            return classNum;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setClassNum(String classNum) {
            this.classNum = classNum;
        }
    }
}
