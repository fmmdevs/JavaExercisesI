package devs.fmm.specialtypes.javalangobject;

import java.util.Objects;

public class Person {
    public long id;
    public int age;
    public double income;
    public boolean isDrugLord;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Double.compare(income, person.income) == 0 && isDrugLord == person.isDrugLord && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, income, isDrugLord, name);
    }
}
