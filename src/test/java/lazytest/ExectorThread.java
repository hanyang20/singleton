package lazytest;

import mysingleton.threadlocal.ThreadLocalSingleton;


public class ExectorThread implements Runnable{
    @Override
    public void run() {
        //      LazySynchronizedSingleton singleton = LazySynchronizedSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
