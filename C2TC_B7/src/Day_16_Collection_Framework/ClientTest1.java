package Day_16_Collection_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ClientTest1 {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // Calling one producer
        executorService.execute(new ProducerTask(buffer));
        // Calling three consumers
        executorService.execute(new ConsumerTask(buffer));
        executorService.execute(new ConsumerTask(buffer));
        executorService.execute(new ConsumerTask(buffer));
        executorService.shutdown();
    }
}