import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        validateString(this.livingEnvironment = livingEnvironment);
    }

    public void toHunt() {
        System.out.println(getName() + " охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public String toString() {
        return "Amphibians{" +
                "name='" + getName() + '\'' + ", age=" + getAge() + '\'' + ", livingEnvironment='" + livingEnvironment + '}';
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        validateString(this.livingEnvironment = livingEnvironment);
    }
}


