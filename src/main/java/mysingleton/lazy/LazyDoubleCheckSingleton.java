package mysingleton.lazy;

/**
 * 懒汉式单例(双重检查)
 * 进行了两次if (INSTANCE == null)检查，这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (INSTANCE == null)，直接return实例化对象。

 优点：线程安全；延迟加载；效率较高。
 */

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton INSTANCE = null;

    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyDoubleCheckSingleton();

                }
            }
        }
        return INSTANCE;
    }
}
