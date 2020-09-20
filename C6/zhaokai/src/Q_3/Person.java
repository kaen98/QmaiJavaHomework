package Q_3;

import java.util.*;

/**
 * 创建一个带id属性的实体类，覆写hashCode和equals方法；将实体类放入集合中，使相同id值得对象不重复；
 */
public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person(1, "zhaokai"));
        set.add(new Person(1, "kaizhao"));

        for (Person p : set) {
            System.out.println(p.toString());
        }
    }
}
