package atif.equalsAndHashCode;

import java.util.Objects;

public class OverrideEqualsAndHashCode {

    private int age;
    private String name;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OverrideEqualsAndHashCode that = (OverrideEqualsAndHashCode) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
