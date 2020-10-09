package test05;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {

        Student student1 = new Student("Tom", 18, 100, "class05");
        Student student2 = new Student("Jerry", 22, 70, "class05");
        Student student3 = new Student("Owen", 25, 90, "class05");
        Student student4 = new Student("Jim", 30, 80, "class05");
        Student student5 = new Student("Steve", 28, 66, "class06");
        Student student6 = new Student("Kevin", 24, 100, "class04");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        int sum = 0;

        for (Student ss : students) {
            sum = sum + ss.getAge();
        }

        int avgAge = sum / students.size();
        System.out.println("年纪平均年龄:" + avgAge);

        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
        ArrayList<Integer> scoreList;

        for (Student ss : students) {
            scoreList = hashMap.get(ss.getClassNum());
            if (scoreList == null) {
                scoreList = new ArrayList<>();
            }
            scoreList.add(ss.getScore());
            hashMap.put(ss.getClassNum(), scoreList);
            //System.out.println(ss.getClassNum() + "-----" + scoreList);
        }

        //System.out.println(hashMap);

        for (String classNum : hashMap.keySet()) {
            //System.out.println(hashMap.get(classNum));
            scoreList = hashMap.get(classNum);
            int sumScore = 0;
            for (int score : scoreList) {
                sumScore += score;
                //System.out.println(score);
            }
            int avgClass = sumScore / scoreList.size();

            System.out.println(classNum + ":平均分:" + avgClass);
        }
    }
}
