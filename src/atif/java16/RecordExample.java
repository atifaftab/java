package atif.java16;


//record is an immutable final class
public record RecordExample(int id, String name) {
//    it generates
//    A public constructor that initializes all components.
//    Accessor methods for each component
}

class Main {
    public static void main(String[] args) {
        RecordExample recordExample = new RecordExample(1, "Atif");
        System.out.println(recordExample.id());
        System.out.println(recordExample.name());
    }
}
