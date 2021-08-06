package com.test.sync;

class Ticket{
    private int number =30;
    public synchronized void  sale(){

        if(number>0){
            System.out.println(Thread.currentThread().getName()+"卖出票"+number--+"，剩余票数："+number);
        }
    }
}

public class SaleTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
       new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 40; i++) {
                   ticket.sale();
               }
           }
       },"线程一").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticket.sale();
                }
            }
        },"线程二").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    ticket.sale();
                }
            }
        },"线程三").start();

    }
}
