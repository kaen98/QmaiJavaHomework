package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 定义一个学生类Student，包含三个属性姓名name、年龄age、性别gender，创建三个学生对象存入ArrayList集合中。
 * 姓名 年龄  性别
 * 张三   20  男
 * 李希  39   男
 * 小七  18   女
 * 1）：遍历集合遍历输出。
 * 2）：求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃。
 *
 * @author fei <xliang.fei@gmail.com>
 * @date 2020/10/7 10:29 下午
 */
public class Demo3 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三", 20, "男"));
        studentList.add(new Student("李希", 39, "男"));
        studentList.add(new Student("小七", 18, "女"));

        print(studentList);

        int maxAgeStudentIndex = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (i > 0) {
                if (studentList.get(i - 1).getAge() < studentList.get(i).getAge()) {
                    maxAgeStudentIndex = i;
                }
            }
        }

        Student maxAgeStudent = studentList.get(maxAgeStudentIndex);
        System.out.println("年龄最大的同学：" + maxAgeStudent.getName() + " 年龄：" + maxAgeStudent.getAge() + " 性别：" + maxAgeStudent.getGender());
        System.out.println("===================================================");

        maxAgeStudent.setName("葫芦娃");

        print(studentList);
    }

    public static void print(List list) {
        Iterator iterator = list.iterator();
        //打印
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge() + " 性别：" + student.getGender());
        }

        System.out.println("===================================================");
    }

    static class Student {
        private String name;
        private int age;
        private String gender;

        public Student(String name, int age, String gender) {
            setAge(age);
            setGender(gender);
            setName(name);
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }
    }
}
