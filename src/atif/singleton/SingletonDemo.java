package atif.singleton;


public class SingletonDemo {
    public static void main(String[] args) {

        SingletonDemoClass objA = SingletonDemoClass.getInstance();
        SingletonDemoClass objB = SingletonDemoClass.getInstance();
        SingletonDemoClass objC = SingletonDemoClass.getInstance();

        if (objA == objB && objB == objC)
            System.out.println("Only one Instance of Singleton class");
        else System.out.println("Not true");

    }
}

class SingletonDemoClass {
    private static SingletonDemoClass singletonDemoClassObj = null;

    private SingletonDemoClass() {
    }

    public static SingletonDemoClass getInstance() {
        if (singletonDemoClassObj == null)
            singletonDemoClassObj = new SingletonDemoClass();
        return singletonDemoClassObj;
    }
}
