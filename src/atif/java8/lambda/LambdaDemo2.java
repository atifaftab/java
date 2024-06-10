package atif.java8.lambda;

interface Home {
    void mood(int num);
}

interface Demo {
    void print(String name);
}

public class LambdaDemo2 {

    public static void main(String[] args) {
        Home obj;
        obj = i -> System.out.println("Number is " + i);
        obj.mood(10);

        Demo demo = str -> System.out.println(str);
        demo.print("Atif");
    }
}
