package lazytest;


public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        //测试懒汉式单例
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
