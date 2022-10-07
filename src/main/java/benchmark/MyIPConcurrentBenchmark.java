package benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class MyIPConcurrentBenchmark {

    @Param({"10", "50", "100", "250", "500"})
    public int iterations;

    @org.openjdk.jmh.annotations.Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(1)
    @Warmup(iterations = 2)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void init() throws InterruptedException {

        Runnable runnable = new Requester();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < iterations; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread: threads){
            try{
                thread.join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
