package Concurrency.synchronizedkeyword;

public class SynchronizedBlock {

    private int count =0;

    public void performSynchronisedTask(){
        synchronized (this){
            setCount(getCount()+1);
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
