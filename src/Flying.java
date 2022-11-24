import java.util.Objects;

public class Flying extends Birds {
    private String typeToMove;

    public Flying(String name, int age, String livingEnvironment, String typeToMove) {
        super(name, age, livingEnvironment);
        validateString(this.typeToMove = typeToMove);
    }

    public void toFly() {
        System.out.println(getName()+" летает");
    }

    public String toString() {
        return "Flying{" + "name='" + getName() + '\'' + ", age=" + getAge() +'\''+
        ", livingEnvironment='" + getLivingEnvironment() + '\'' + ", typeToMove='" + typeToMove + '\'' +
                '}';
    }


    public String getTypeToMove() {
        return typeToMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeToMove, flying.typeToMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeToMove);
    }
}
