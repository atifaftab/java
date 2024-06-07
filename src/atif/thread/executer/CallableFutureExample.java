package atif.thread.executer;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample implements Callable<Integer> {
    public static void main(String[] args) {
        int count = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(count);
//        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        int val = 0;
        try {
            Future<Integer> future = service.submit(new CallableFutureExample());
            val = future.get();

        } catch (ExecutionException e) {
            System.out.println(e);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("Thread: " + val + " " + Thread.currentThread().getName());
    }

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
