package com.company;

public class Main {

    public static void main(String[] args) {
/*
        MultiThread myMultiThread = new MultiThread(8,100 );
        MultiThread multiThread1 = new MultiThread(1, 0);
        MultiThread multiThread2 = new MultiThread(2,300 );
        MultiThread multiThread3 = new MultiThread(5, 200);
        Thread thread1 = new Thread(multiThread1);
        Thread thread2 = new Thread(myMultiThread);
        Thread thread3 = new Thread(multiThread2);
        Thread thread4= new Thread(multiThread3);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

 */
        thread(100);


    }
    public static void thread(int a){
        for (int i = 0; i < a; i++) {
            MultiThread myMulti = new MultiThread(1,0,i+1);
            Thread t = new Thread(myMulti);
            t.start();

        }
    }

}
