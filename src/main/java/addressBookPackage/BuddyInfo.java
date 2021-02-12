package addressBookPackage;

import javax.persistence.*;

@Entity
public class BuddyInfo {



    private Long id = null;
    private String name;
    private String address;
    private String phoneNumber;

    @Id
    @GeneratedValue
    public Long getId(){
        return this.id;
    }

    public BuddyInfo(){

        this.name = null;
        this.address = null;
        this.phoneNumber = null;
    }
    public BuddyInfo(String name, String address, String phoneNumber) {


        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
         this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    public void setId(Long id){
        this.id = id;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        BuddyInfo test = new BuddyInfo ("Homer", "Ottawa", "613");
        System.out.println("Hello " + test.getName());
    }

    @Override
    public String toString() {
//        return "BuddyInfo{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
        return String.format("BuddyInfo [id = %d, name = '%s', address = '%s', phoneNumber = '%s']", id, name,address, phoneNumber);
    }
}
