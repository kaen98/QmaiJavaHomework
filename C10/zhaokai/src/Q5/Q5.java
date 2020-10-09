package Q5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 5.  有如下Student 对象，包含三个属性姓名、年龄、分数，班号，
 *  　  private String name;
 *     private int age;
 *     private int score;
 *     private String classNum;
 * 其中，classNum 表示学生的班号，例如“class05”。 创建集合并完成下列要求：
 * 1） 计算所有学生的平均年龄
 * 2） 计算各个班级的平均分
 */
public class Q5 {
    public static void main(String[] args) {
        Student s1 = new Student("Tom", 18, 100, "class05");
        Student s2 = new Student("Jerry", 22, 70, "class04");
        Student s3 = new Student("Owen", 25, 90, "class05");
        Student s4 = new Student("Jim", 30, 80, "class05");
        Student s5 = new Student("Steve", 28, 66, "class06");
        Student s6 = new Student("Kevin", 24, 100, "class04");

        List<Student> sList = new ArrayList<>();
        HashMap<String, StudentClass> sMap = new HashMap<String, StudentClass>();

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);
        sList.add(s5);
        sList.add(s6);

        int averageAge = 0;
        int totalAge = 0;
        for (Student s : sList) {
            totalAge = totalAge + s.getAge();
            if (sMap.containsKey(s.getClassNum())) {
                StudentClass sc = sMap.get(s.getClassNum());
                sc.addTotalScore(s.getScore());
                sc.addTotalStudentNum(1);
            } else {
                sMap.put(s.getClassNum(), new StudentClass(s.getClassNum(), s.getScore(), 1));
            }
        }

        averageAge = totalAge / sList.size();
        System.out.println("计算所有学生的平均年龄:" + averageAge);

        System.out.println("\n 计算各个班级的平均分:");
        for (StudentClass sc : sMap.values()) {
            System.out.println(sc.getClassNum() + ":" + sc.getAverageScore());
        }
    }
}

class StudentClass {
    private String classNum = "";
    private int totalScore = 0;
    private int totalStudentNum = 0;
    private int averageScore = 0;

    public StudentClass(String classNum, int totalScore, int totalStudentNum) {
        this.classNum = classNum;
        this.totalScore = totalScore;
        this.totalStudentNum = totalStudentNum;
    }

    public String getClassNum() {
        return classNum;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getTotalStudentNum() {
        return totalStudentNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setTotalStudentNum(int totalStudentNum) {
        this.totalStudentNum = totalStudentNum;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public void addTotalScore(int score) {
        this.totalScore = this.totalScore + score;
    }

    public void addTotalStudentNum(int studentNum) {
        this.totalStudentNum = this.totalStudentNum + studentNum;
    }

    public int getAverageScore() {
        this.averageScore = this.totalScore / this.totalStudentNum;
        return this.averageScore;
    }
}

class Student {
    private String name = "";
    private int age = 0;
    private int score = 0;
    private String classNum = "";


    public Student(String name, int age, int score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public String getClassNum() {
        return classNum;
    }
}
