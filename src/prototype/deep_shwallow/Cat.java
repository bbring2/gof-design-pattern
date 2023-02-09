package prototype.deep_shwallow;

public class Cat implements Cloneable {

    private String name;
    private Age age;

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Cat clone() {
        try {
            Cat clone = (Cat) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Cat copy() {
        Cat cat = this.clone();

        cat.setAge(new Age(this.age.getYear(), this.age.getValue()));

        return cat;
    }
}
