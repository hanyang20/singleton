package mysingleton.hungry;

/**
 * 饿汉式单例模式(静态代码块)
 优点：类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例在类装载的时候就完成实例化。避免了线程同步问题。

 缺点：在类装载的时候就完成实例化，没有达到懒加载的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */


public class HungryStaticSingleton {
    private static final HungryStaticSingleton INSTANCE;
    static {
        INSTANCE = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance(){
        return  INSTANCE;
    }
}
