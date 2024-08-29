package com.me.lambda;

public class RunnableLambda {
    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("inside prior to java 8");
            }
        }).start();

        /**
         * After java 8
         */

        new Thread(() -> System.out.println("inside after java 8 - (1)")).start();
        new Thread(() -> {System.out.println("inside after java 8 - (2) - within block");}).start();
        new Thread(() -> {
            System.out.println("inside after java 8 - (3) - multi-statement 1");
            System.out.println("inside after java 8 - (3) - multi-statement 2");
        }).start();
        //using variable initialization
        Runnable runnableLambda = () -> System.out.println("inside after java 8 - (4) - using variable initialization");
        new Thread(runnableLambda).start();
    }
}
