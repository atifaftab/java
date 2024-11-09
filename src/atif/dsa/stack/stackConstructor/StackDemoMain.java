package atif.dsa.stack.stackConstructor;

public class StackDemoMain {
    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo(2);
        stackDemo.getTop();
        stackDemo.getHeight();
        stackDemo.printStack();
        System.out.println("pushing new value");
        stackDemo.push(49);
        stackDemo.printStack();
    }
}
