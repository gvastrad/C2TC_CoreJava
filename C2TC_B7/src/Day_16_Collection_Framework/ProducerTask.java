package Day_16_Collection_Framework;

public class ProducerTask implements Runnable{
    private Buffer buffer;
    public ProducerTask(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        // putting just three elements
        for(int i = 0; i < 3; i++){
            buffer.put(i);
        }
    }
}