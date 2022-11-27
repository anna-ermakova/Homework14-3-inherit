import java.util.Objects;

public class Mammals extends Animals {
    private String livingEnvironment;
    private int speed;

    public Mammals(String name, int age, String livingEnvironment, int speed) {
        super(name, age);
        validateString(this.livingEnvironment = livingEnvironment);
        validateInt(this.speed = speed);
    }

    public void toWalk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", speed=" + speed +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        validateString(this.livingEnvironment = livingEnvironment);
    }

}
