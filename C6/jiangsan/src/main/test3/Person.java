package main.test3;

import java.util.Objects;

/**
 * @author san
 */
public class Person {
    public int id;
    public String number;

    public Person(int id, String number) {
        super();
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(number, person.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }
}
