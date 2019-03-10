package mysingleton.registry;

/**
 * 枚举式单例
 * JDK1.5中才加的枚举实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 优点:jvm保证了枚举的线程安全,不允许反射 jdk早已看透了一切
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
