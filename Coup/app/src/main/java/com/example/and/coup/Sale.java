package com.example.and.coup;

/**
 * Created by Lior on 24/09/2017.
 */

public class Sale {
    String Id;
    String name;
    String price;
    String Discount;
    String getDiscount;

    public Sale() {
    }

    public Sale(String id, String name, String price, String discount, String getDiscount) {
        Id = id;
        this.name = name;
        this.price = price;
        Discount = discount;
        this.getDiscount = getDiscount;
    }

    public String getId() {return Id;}
    public void setId(String id) {Id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}
    public String getDiscount() {return Discount;}
    public void setDiscount(String discount) {Discount = discount;}
    public String getGetDiscount() {return getDiscount;}
    public void setGetDiscount(String getDiscount) {this.getDiscount = getDiscount;}
}
