package test03;

/**
 * @author san
 */
public class Student {

    String name;
    int age;
    String gender;

    Student(String name, int age, String gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
