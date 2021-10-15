package Concurrency.synchronizedkeyword;

public class Synchronized {

    private int sum =0;

    public synchronized void synchronisedCalculate(){
        setSum(getSum()+1);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
