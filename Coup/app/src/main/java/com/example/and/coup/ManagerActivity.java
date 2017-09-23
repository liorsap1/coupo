package com.example.and.coup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ManagerActivity extends AppCompatActivity {

    ImageView man_coupon;
    ImageView man_shop;
    ImageView man_sale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        man_coupon = (ImageView)findViewById(R.id.man_new_cupon);
        man_shop = (ImageView)findViewById(R.id.man_new_shop);
        man_sale = (ImageView)findViewById(R.id.man_new_sale);


        man_coupon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),NewCouponActivity.class);
                startActivity(intent);
            }
        });
        man_shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        man_sale.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

    }
}
