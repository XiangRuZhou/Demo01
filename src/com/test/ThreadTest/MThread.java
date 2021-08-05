package com.test.ThreadTest;

class ThreadObject implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public  class MThread {
    public static  void main(String [] args){
        ThreadObject threadObject = new ThreadObject();
        Thread s = new Thread(threadObject);
        s.start();
    }
}