package prototype;

import java.io.*;

/**
 * 以配钥匙为例
 */
public class KeyPrototype{
    private Integer length;//钥匙长度
    private String  color;//钥匙颜色


    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object cloneKeyPrototype(){//需要克隆的钥匙
        KeyPrototype needKeyPrototype = new KeyPrototype();
        needKeyPrototype.setColor(this.color);
        needKeyPrototype.setLength(this.length);
        return needKeyPrototype;
    }
    // 使用序列化技术实现完全拷贝
    public Object deepClone(){
        try {

        // 将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();

        //读流创建对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        KeyPrototype o = (KeyPrototype)objectInputStream.readObject();
        return o;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
