package mysingleton.inner;


/**
 * 懒汉式单例(匿名内部类)
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
只有使用才会实例化，不使用不会实例化
 优点：避免了线程不安全，延迟加载，效率高。
  */

//老师理解的:这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//完美地屏蔽了这两个缺点
//史上最牛B的单例模式的实现方式
public class LazyInnerClassSingleton {
    //默认使用LazyInnerClassGeneral的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyInnerClassSingleton(){
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许创建多个单例");
        }
    }


    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.INSTANCE;
    }

    //延迟加载 ,不使用就不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
