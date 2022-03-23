package com.company;

public class MultiThread implements Runnable {

    public int aNumber;
    public int sleep;
    public int navn;
    public MultiThread(int number, int sleep, int navn){
        aNumber= number;
        this.sleep = sleep;
        this.navn = navn;

    }


    public void run(){
        try {
            Thread.sleep(sleep);
            System.out.println("Dette er tråd #" + navn);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
