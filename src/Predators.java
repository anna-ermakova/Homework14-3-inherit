import java.util.Objects;

public class Predators extends Mammals{

    private String foodPredators;

    public Predators(String name, int age, String livingEnvironment, int speed, String foodPredators) {
        super(name, age, livingEnvironment, speed);
        validateString(this.foodPredators=foodPredators);
    }

    public void toHunt() {
        System.out.println(getName()+" охотится");
    }

    @Override
    public String toString() {
        return "Predators{" +
                "name='" + getName() + '\'' +  ", age=" + getAge() + '\''+", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", speed=" + getSpeed() +'\''+", food='" + foodPredators +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(foodPredators, predators.foodPredators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodPredators);
    }

    public String getFood() {
        return foodPredators;
    }

    public void setFood(String food) {
        validateString(this.foodPredators = foodPredators);
    }
}
