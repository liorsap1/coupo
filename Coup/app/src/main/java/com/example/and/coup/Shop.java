package com.example.and.coup;

/**
 * Created by and on 9/22/2017.
 */

public class Shop {

    String id;
    String name;
    String address;
    String longtitude;
    String latttitude;
    String phone;
    String openHours;
    boolean open;

    public Shop(String id, String name, String address, String phone, String openHours, boolean open) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.openHours = openHours;
        this.open = open;
    }
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
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
    public String getLongtitude() {return longtitude;}
    public void setLongtitude(String longtitude) {this.longtitude = longtitude;}
    public String getLatttitude() {return latttitude;}
    public void setLatttitude(String latttitude) {this.latttitude = latttitude;}
}
