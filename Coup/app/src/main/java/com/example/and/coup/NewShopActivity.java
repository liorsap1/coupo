package com.example.and.coup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class NewShopActivity extends AppCompatActivity {


    EditText shopName;
    EditText shopId;
    EditText shopAdress;
    EditText shopPhone;
    EditText shopHours;
    Button submit,cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_shop);

        shopName = (EditText)findViewById(R.id.shop_name);
        shopId = (EditText)findViewById(R.id.shop_number);
        shopAdress = (EditText)findViewById(R.id.shop_address);
        shopPhone = (EditText)findViewById(R.id.shop_phone);
        shopHours = (EditText)findViewById(R.id.shop_date);
        submit = (Button) findViewById(R.id.shop_submit);
        cancel = (Button) findViewById(R.id.shop_cancel);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                DatabsaeUtill.writeToDatabase_shop(createShop());
                Intent intent = new Intent(getApplicationContext(),ManagerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    private Shop createShop(){
        String id = shopId.getText().toString();
        String shopname = shopName.getText().toString();
        String address = shopAdress.getText().toString();
        String phone = shopPhone.getText().toString();
        String hours = shopHours.getText().toString();
        return new Shop(id,shopname,address,phone,hours,true);
    }

    private View validateDetails(){
        return null;
    }
}
