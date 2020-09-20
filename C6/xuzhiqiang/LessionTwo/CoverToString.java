package classSix.LessionTwo;

public class CoverToString {

    protected String name;

    protected int age;

    protected String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String toString() {
        return "{" + "'name:'" + name + '\'' + ", 'age:'" + age + '\'' + ", 'company:'" + company + '\'' + '}';
    }

}

