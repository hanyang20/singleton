package mysingleton.hungry;

/**
 * 饿汉式单例
  优点：在类装载的时候就完成实例化。避免了线程同步问题。

  缺点：在类装载的时候就完成实例化，没有达到懒加载的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。

  绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  INSTANCE;
    }
}
