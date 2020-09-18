package classSix.LessionThree;

public class Persion {
    public int id;
    public String name;
    public String sex;

    public Persion(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }


    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        Persion other = (Persion) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }
}
