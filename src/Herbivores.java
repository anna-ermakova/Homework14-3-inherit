import java.util.Objects;

public class Herbivores extends Mammals  {
    private String foodMammals;

    public Herbivores(String name, int age, String livingEnvironment, int speed,String food) {
        super(name, age, livingEnvironment, speed);
        validateString(this.foodMammals = food);
    }

    public void toGraze() {
        System.out.println(getName() + " пасется");
    }


    @Override
    public String toString() {
        return "Herbivores{" +
                "name='" + getName() + '\'' +  ", age=" + getAge() + '\''+", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", speed=" + getSpeed() +'\''+", food='" + foodMammals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(foodMammals, that.foodMammals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodMammals);
    }

    public String getFood() {
        return foodMammals;
    }

    public void setFood(String food) {
        validateString(this.foodMammals = food);
    }
}
