import java.util.ArrayList;
import java.util.List;

/**
 * 3. 定义一个学生类Student，包含三个属性姓名name、年龄age、性别gender，创建三个学生对象存入ArrayList集合中。
 * 姓名 年龄  性别
 * 张三   20  男
 * 李希  39   男
 * 小七  18   女
 *   1）：遍历集合遍历输出。
 *   2）：求出年龄最大的学生，然后将该对象的姓名变为：葫芦娃。
 */
public class Q3 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20, "男");
        Student s2 = new Student("李希", 39, "男");
        Student s3 = new Student("小七", 18, "女");
        Student ageMax = new Student();

        List<Student> sList = new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        System.out.println("遍历集合遍历输出:");
        System.out.println("姓名 年龄 性别");
        for (Student s : sList) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getGender());

            // 年龄最大的学生
            if (s.getAge() > ageMax.getAge()) {
                ageMax = s;
            }
        }

        System.out.println("\n年龄最大的学生为：");
        System.out.println(ageMax.getName() + " " + ageMax.getAge() + " " + ageMax.getGender());

        System.out.println("\n将该对象的姓名变为：葫芦娃");
        ageMax.setName("葫芦娃");
        System.out.println(ageMax.getName() + " " + ageMax.getAge() + " " + ageMax.getGender());
    }

}

class Student {
    private String name = "";
    private Integer age = 0;
    private String gender = "";

    public Student() {

    }


    public Student(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
