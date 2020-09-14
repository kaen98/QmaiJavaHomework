package main.test2;

/**
 * @author san
 */
public class Person {
    String name;
    String gender;
    String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "{" +
                "'name:'" + name + '\'' +
                ", 'gender:'" + gender + '\'' +
                ", 'company:'" + company + '\'' +
                '}';
    }
}
