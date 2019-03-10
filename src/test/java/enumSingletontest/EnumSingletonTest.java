package enumSingletontest;

import mysingleton.registry.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) {
        try {
              //获取class对象
            Class clazz = EnumSingleton.class;
            //获取无参构造
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            //因为无参构造方法是私有的,所以暴力反射
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("Tom",666);//jdk

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}