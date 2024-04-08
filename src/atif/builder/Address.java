package atif.builder;

public class Address {
    private String address;

    Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }
}
