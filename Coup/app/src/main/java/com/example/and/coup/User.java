package com.example.and.coup;

/**
 * Created by Lior on 24/09/2017.
 */

public class User {
    String Id;
    String type;
    String fname;
    String lastname;
    String position;

    public User() {
    }

    public User(String type, String fname, String lastname, String position) {
        this.type = type;
        this.fname = fname;
        this.lastname = lastname;
        this.position = position;
    }

    public String getId() {return Id;}
    public void setId(String id) {Id = id;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getFname() {return fname;}
    public void setFname(String fname) {this.fname = fname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}
}
