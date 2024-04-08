package atif.java8.Interfaces;


interface Man {
    void work();
}

public class InterfaceInnerClassImplementation {
    public static void main(String[] args) {

        Man objMan;
        objMan = new Man() { //anonymous Inner class
            public void work() {
                System.out.println("working... ");
            }
        };
        objMan.work();
    }
}
