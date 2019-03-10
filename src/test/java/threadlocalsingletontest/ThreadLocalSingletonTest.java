package threadlocalsingletontest;

import lazytest.ExectorThread;
import mysingleton.threadlocal.ThreadLocalSingleton;


public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        //单线程下是单例的,
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        //多线程下不符合单例的原则 ,线程不安全,伪线程
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
