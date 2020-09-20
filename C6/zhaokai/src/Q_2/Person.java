package Q_2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name:" + '"' + name + '"' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person("zhaokai", 25);
        String s = p.toString();

        System.out.println(s);
    }
}
