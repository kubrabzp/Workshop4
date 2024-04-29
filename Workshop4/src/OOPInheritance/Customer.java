package OOPInheritance;

public class Customer extends User{

    private long phoneNumber;
    private String address;
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Customer(){

    }

    public Customer(long phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
