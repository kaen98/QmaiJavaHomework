package C10;

public class StudentTwo {
    private String name;
    private int age;
    private int score;
    private String classNum;

    StudentTwo(String name, int age, int score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
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

    @Override
    public String toString() {
        return "StudentTwo {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", classNum='" + classNum + '\'' +
                '}';
    }
}
