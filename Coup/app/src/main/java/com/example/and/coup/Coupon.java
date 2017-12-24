package com.example.and.coup;

/**
 * Created by and on 8/26/2017.
 */

public class Coupon {
    String id;
    String productName;
    String startDate;
    String endDate;
    String price;
    String discount;

    public Coupon(String id,
                  String productName,
                  String endDate,
                  String price,
                  String discount) {
        this.id=id;
        this.productName=productName;
        this.endDate=endDate;
        this.price=price;
        this.discount=discount;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
