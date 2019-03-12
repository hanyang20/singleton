package deepclone;

public class DeepTest {
    public static void main(String[] args){


        Address address = new Address();
        address.setLocation("深圳");
        Student worker = new Student();
        worker.address = address;
        worker.name = "张圣";

        Student deepCloneStudent = worker.deepClone();
        System.out.println("深克隆的比较: "+(worker.getAddress() == deepCloneStudent.getAddress()));


        Student qianClonestudent = worker.qianClone(worker);
        System.out.println("浅克隆的比较: "+(worker.getAddress() == qianClonestudent.getAddress()));



        // 浅复制只复制值类型的变量和对对象的引用
        // 深复制不仅复制值类型的变量，把原对象引用的对象也进行复制.

    }
}
