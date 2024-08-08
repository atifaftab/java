package atif.designPattern.builder;

public class Person {
    private String name;
    private int age;
    private Address address;

    // Private constructor (avoids creating Person objects without using the builder)
    private Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private Address address;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(name, age, address);
        }
    }

}
