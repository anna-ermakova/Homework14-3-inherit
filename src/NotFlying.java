import java.util.Objects;

public class NotFlying extends Birds{

    private String typeToMove;

    public NotFlying(String name, int age, String livingEnvironment, String typeToMove) {
        super(name, age, livingEnvironment);
        validateString(this.typeToMove = typeToMove);
    }
    public String toString() {
        return "NotFlying{" + "name='" + getName() + '\'' + ", age=" + getAge() +'\''+
                ", livingEnvironment='" + getLivingEnvironment() + '\'' + ", typeToMove='" + typeToMove + '\'' +
                '}';
    }
    public void toWalk() {
        System.out.println(getName() + " гуляет");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(typeToMove, notFlying.typeToMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeToMove);
    }

    public String getTypeToMove() {
        return typeToMove;
    }
}
