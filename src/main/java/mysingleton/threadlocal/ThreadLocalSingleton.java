package mysingleton.threadlocal;

/**
 * 线程单例 第一次见到
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_SINGLETON_THREAD_LOCAL =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return THREAD_LOCAL_SINGLETON_THREAD_LOCAL.get();
    }
}
