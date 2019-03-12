package deepclone;




import java.io.*;

public class Student implements Cloneable,Serializable{
    public Address address;
     String name;
    public Student(){
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    // 使用序列化技术实现完全拷贝
    public Student deepClone(){
        try {

            // 将对象写入流中
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();

            //读流创建对象
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Student o = (Student)objectInputStream.readObject();
            return o;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public Student qianClone(Student clone){
        Student student = new Student();
        student.address = clone.address;
        student.name = clone.name;
        return student;

        }
}
