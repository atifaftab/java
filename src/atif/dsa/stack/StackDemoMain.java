package atif.dsa.stack;

public class StackDemoMain {
    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo(2);
        stackDemo.getTop();
        stackDemo.getHeight();
        stackDemo.printStack();
        System.out.println("---- PUSH ----");
        stackDemo.push(49);
        stackDemo.push(34);
        stackDemo.push(78);
        stackDemo.push(5);
        stackDemo.printStack();
        System.out.println("---- POP ----");
        System.out.println(stackDemo.pop().value);
        stackDemo.printStack();
    }
}
