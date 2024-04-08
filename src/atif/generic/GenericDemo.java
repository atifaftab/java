package atif.generic;

public class GenericDemo {
    public static void main(String[] args) {
        CommonInterface<String> t = new DepService<>();
        t.callMe("hello");
        CommonInterface<Integer> t2 = new EmpService<>();
        t2.callMe(12);
        CommonInterface tt= getType("ABCD");
        tt.callMe("76776");
    }

    //@Qulifier("empService")
    //CommonInterface commonInterface;

    static <T> CommonInterface getType(String type) {
        if (type.equals("Emp")) {
            return new EmpService<T>();
        } else {
            return new DepService();
        }
    }
//
//    static void callmeGen(CommonInterface c, Object t) {
//        c.callMe(t);
//    }
}

class EmpService<T> implements CommonInterface<T> {


    @Override
    public <T> void callMe(T t) {
        System.out.println("emp service call " + t);
    }
}

class DepService<T> implements CommonInterface<T> {


    @Override
    public <T> void callMe(T t) {
        System.out.println("Dep service call " + t);
    }
}


