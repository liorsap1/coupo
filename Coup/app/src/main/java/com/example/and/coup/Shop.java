package com.example.and.coup;

/**
 * Created by and on 9/22/2017.
 */

public class Shop {

    String number;
    String name;
    String address;
    String phone;
    String openHours;
    boolean open;

    public Shop(String number, String name, String address, String phone, String openHours, boolean open) {
        this.number = number;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.openHours = openHours;
        this.open = open;
    }
    public String getId() {return number;}
    public void setId(String number) {this.number = number;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
    public String getOpenHours() {return openHours;}
    public void setOpenHours(String openHours) {this.openHours = openHours;}
    public boolean isOpen() {return open;}
    public void setOpen(boolean open) {this.open = open;}
}
