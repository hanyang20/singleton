package deepclone;

import java.io.Serializable;

public class Address implements  Cloneable,Serializable{

    private String location;//位置

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Address clone(){
        Address address;
        try {
           return address = (Address)super.clone();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
