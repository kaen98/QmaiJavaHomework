package test04;

/**
 * @author san
 */
public class Worker {

    String name;
    int age;
    int wage;


    Worker(String name, int age, int wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                '}';
    }
}
