package atif.innerClass;

interface Office {
    void work();
}

public class InnerClass2 {

    public static void main(String[] args) {
        Office obj;
        obj = new Office() {
            public void work() {
                System.out.println("more working....");
            }
        };
        obj.work();
    }
}
