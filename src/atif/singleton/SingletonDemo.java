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
        //why we check its null, to make sure if no instance there then and only then we create new instance
        //otherwise we send back the already created instance
        if (singletonDemoClassObj == null)
            singletonDemoClassObj = new SingletonDemoClass();
        return singletonDemoClassObj;
    }
}
