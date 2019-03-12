package prototype;

import java.io.IOException;

public class KeyPrototypeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //浅克隆
        KeyPrototype keyPrototype = new KeyPrototype();
        keyPrototype.setLength(5);//长度厘米
        keyPrototype.setColor("银色");
        //克隆的对象
        KeyPrototype cloneKeyPrototype = (KeyPrototype)keyPrototype.cloneKeyPrototype();

        System.out.println("克隆前引用类型地址值："+keyPrototype.getColor());//比较浅克隆的颜色
        System.out.println("克隆后引用类型地址值："+cloneKeyPrototype.getColor());//比较浅克隆的颜色
        System.out.println((keyPrototype.getColor().equals(cloneKeyPrototype.getColor()))? "相同" : "不相同");



    }
}
