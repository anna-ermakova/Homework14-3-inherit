import java.util.Objects;

public class Birds extends Animals{
    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        validateString(this.livingEnvironment = livingEnvironment);
    }

    public void toHunt() {
        System.out.println(getName()+" охотится");
    }


    @Override
    public String toString() {
        return "Birds{" + ", name='" + getName() + '\'' + ", age=" + getAge() +
                "livingEnvironment='" + livingEnvironment + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        validateString(this.livingEnvironment = livingEnvironment);
    }
}
