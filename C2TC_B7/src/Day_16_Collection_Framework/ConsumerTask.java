package Day_16_Collection_Framework;

public class ConsumerTask implements Runnable{
    private Buffer buffer;
    public ConsumerTask(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            // delay to make sure producer starts first
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buffer.get();
    }    
}