package com.qinghuo.prj;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App {

    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        executor.scheduleWithFixedDelay(new MyTask(),5,5, TimeUnit.SECONDS);
    }

    static class MyTask implements Runnable {
        private int i = 10;
        @Override
        public void run() {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + (i++));
        }
    }
}
