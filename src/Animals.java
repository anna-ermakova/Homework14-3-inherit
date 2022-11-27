import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        validateString(this.name= name);
        validateInt(this.age = age);
    }

    public void toEat() {
        System.out.println(name + " ест");
    }

    public void toSlip() {
        System.out.println(name + " спит");
    }

    public void toMove() {
        System.out.println(name + " перемещается");
    }

    public String validateString(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "default":value;
    }
    public int validateInt(int value) {
        return value == 0 ? 0 : Math.abs(value);
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        validateString(this.name = name);
    }
    public void printAnimal() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
