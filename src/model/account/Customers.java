package model.account;

public class Customers extends Account {
    private String name;
    private int age;
    private String address;
    private String email;

    public Customers(String id, String password, String name, int age, String address, String email) {
        super(id, password);
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void buyProduct(String productID, int Number,double voteStar){

    }

    @Override
    public String toString() {
        return super.toString()+ "Customers{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
