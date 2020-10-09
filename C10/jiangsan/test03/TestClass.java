package test03;

import java.util.ArrayList;

/**
 * @author san
 */
public class TestClass {

    public static void main(String[] args) {

        Student student1 = new Student("张三", 20, "男");
        Student student2 = new Student("李希", 39, "男");
        Student student3 = new Student("小七", 18, "女");


        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        System.out.println(studentArrayList);

        int tmp = 0;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).age > tmp) {
                tmp = i;
            }
        }

        Student ss = studentArrayList.get(tmp);
        ss.name = "葫芦娃";

        System.out.println(studentArrayList);
    }
}
