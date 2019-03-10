package mysingleton.lazy;

/**
 * 懒汉式单例(线程安全)
 优点:保证了线程安全
 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 */

public class LazySynchronizedSingleton {
    private LazySynchronizedSingleton(){}

    private static LazySynchronizedSingleton INSTANCE = null;
    public synchronized static LazySynchronizedSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazySynchronizedSingleton();
        }
        return INSTANCE;
    }
}
