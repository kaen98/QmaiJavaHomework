package C10;

import java.util.ArrayList;
import java.util.List;

class Q3 {
    public static void main(String[] args) {
        /**
         * 3. 定义一个学生类Student，包含三个属性姓名name、年龄age、性别gender，创建三个学生对象存入ArrayList集合中。
         * 姓名 年龄  性别
         * 张三   20  男
         * 李希  39   男
         * 小七  18   女
         *   1）：遍历集合遍历输出。
         *   2）：求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃。
         */
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("张三", 20, "男"));
        stu.add(new Student("李希", 39, "男"));
        stu.add(new Student("小七", 18, "女"));
        for (Student s : stu){
            System.out.println("姓名："+s.name+"\r\n年龄："+s.age+"\r\n性别："+s.gender+"\n");
        }

        int key = 0;
        for (int i=0;i<stu.size();i++){
            if (stu.get(i).age >= stu.get(key).age) {
                key = i;
            }
        }

        stu.get(key).name = "葫芦娃";
        for (Student s : stu){
            System.out.println("姓名："+s.name+"\r\n年龄："+s.age+"\r\n性别："+s.gender+"\n");
        }
    }

}

class Student{
    public String name = null;
    public int age = 0;
    public String gender = null;
    public Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}