package C10;

public class Worker {
    String name;
    Integer age;
    Integer wages;

    Worker(String name, int age, Integer wages) {
        this.name = name;
        this.age = age;
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wages='" + wages + '\'' +
                '}';
    }
}
