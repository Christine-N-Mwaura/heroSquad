package hero;
import java.util.Objects;
public class Individual_Hero {

    private String name;
    private int Age;
    private String specialPower;
    private String weakness;
    private int id;



    public Individual_Hero(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Individual_Hero)) return false;
       Individual_Hero hero = (Individual_Hero) o;
        return getName() == hero.getName() &&
                getId() == hero.getId() &&
                Objects.equals(getName(), hero.getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getAge(), getId());
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.Age;
    }
    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }
    public int getId() {
        return id;
    }
}
