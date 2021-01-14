package model.account;

import model.FileWriteReader;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Account {

    private String name;
    private int age;
    private String address;
    private String email;
    private String staffID;

    public Admin() {
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

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }


    @Override
    public String toString() {
        return super.toString() + "admin{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", staffID='" + staffID + '\'' +
                '}';
    }
}
