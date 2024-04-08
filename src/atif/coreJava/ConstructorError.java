package atif.coreJava;

public class ConstructorError {
    String name;
    public ConstructorError(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        ConstructorError constructorError = new ConstructorError();
        ConstructorError constructorError = new ConstructorError("Sarah");

    }
}
