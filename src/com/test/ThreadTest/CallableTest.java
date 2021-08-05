package com.test.ThreadTest;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String [] args){
        ThreadCallble threadCallble = new ThreadCallble();
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(threadCallble);
        Thread thread = new Thread(integerFutureTask);
        thread.start();
        try {
            Integer integer = integerFutureTask.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class ThreadCallble implements Callable<Integer>{

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        Integer sum = 0;
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
            sum+=i;
        }
        return sum;
    }
}