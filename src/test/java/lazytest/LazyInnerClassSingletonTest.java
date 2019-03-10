package lazytest;

import mysingleton.inner.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try{
            //反射获取class对象
            Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;

            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //因为无参构造方法是私有的,所以暴力反射
            c.setAccessible(true);

            LazyInnerClassSingleton o1 = (LazyInnerClassSingleton) c.newInstance();
            LazyInnerClassSingleton o2 = (LazyInnerClassSingleton) c.newInstance();
            //调用了两次构造方法，相当于new了两次
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1 == o2);//false
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
