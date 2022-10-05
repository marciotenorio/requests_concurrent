package request;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class MyIPConcurrentBenchmark {

    @org.openjdk.jmh.annotations.Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 20, warmups = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void init(){

        Runnable runnable = new Requester();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }


}
