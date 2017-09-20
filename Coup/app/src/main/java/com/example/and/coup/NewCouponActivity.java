package com.example.and.coup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class NewCouponActivity extends AppCompatActivity {


    EditText couponName;
    EditText couponId;
    EditText couponProductPrice;
    NumberPicker couponDiscount;
    EditText couponDate;
    Button submit,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_coupon);
        couponId = (EditText)findViewById(R.id.coupon_number);
        couponName = (EditText)findViewById(R.id.coupon_name);
        couponProductPrice = (EditText)findViewById(R.id.coupon_product_price);
        couponDiscount = (NumberPicker)findViewById(R.id.coupon_discount);
        couponDate = (EditText)findViewById(R.id.coupon_date);
        submit = (Button) findViewById(R.id.coupon_submit);
        cancel = (Button) findViewById(R.id.coupon_cancel);
    }


    private Coupon createCoupon(){
        String id = couponId.getText().toString();
        String productName = couponName.getText().toString();
        String endDate = couponDate.getText().toString();
        String discount = ""+couponDiscount.getValue();
        String priceBefore = couponProductPrice.getText().toString();
        String priceAfter = ""+Double.parseDouble(couponProductPrice.getText().toString())*(100/couponDiscount.getValue());
        return new Coupon(id,productName,endDate,Double.parseDouble(priceAfter),Integer.parseInt(discount));
    }
}
