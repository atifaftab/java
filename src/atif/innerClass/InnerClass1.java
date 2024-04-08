package atif.innerClass;

interface Man {
    void work();
}

public class InnerClass1 {
    public static void main(String[] args) {
        Man obj;
        obj = new Man() {
            public void work() {
                System.out.println("working...");
            }
        };
        obj.work();
    }
}
