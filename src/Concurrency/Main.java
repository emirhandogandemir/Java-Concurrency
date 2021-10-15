package Concurrency;

import Concurrency.future.SquareCalculator;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<Integer> future = new SquareCalculator().calculate(10);
        while(!future.isDone()) {
            System.out.println("Calculating...");
            Thread.sleep(300);
        }
        Integer result = future.get();
    }

}
