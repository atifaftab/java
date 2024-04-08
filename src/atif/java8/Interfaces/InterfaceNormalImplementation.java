package atif.java8.Interfaces;

interface callInterface {
    void call();
}

class callService implements callInterface {
    public void call() {
        System.out.println("calling...!!! ");
    }
}

public class InterfaceNormalImplementation {

    public static void main(String[] args) {
        callInterface objCall = new callService();

        objCall.call();
    }
}
