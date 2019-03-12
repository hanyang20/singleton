package deepclone;

public class SimpleTest {
    public static void main(String[] args){


        Address address = new Address();
        address.setLocation("深圳");

        Address cloneAddress = address.clone();


        System.out.println("提供的原型城市名称:  "+address.getLocation());
        System.out.println("克隆的的城市名称:  "+cloneAddress.getLocation());
        System.out.println("克隆前后是否相同:  "+(address == cloneAddress?"相同":"不相同"));



    }
}
