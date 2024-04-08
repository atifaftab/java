package atif.java8;


interface Phone {
    void call();

    default void print() {
        System.out.println("printing... ");
    }

}

class SmartPhones implements Phone {

    public void call() {
        System.out.println("calling... ");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {

        Phone objPhone = new SmartPhones();

        objPhone.call();
        objPhone.print();
    }
}
