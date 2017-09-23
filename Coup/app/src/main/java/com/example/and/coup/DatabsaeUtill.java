package com.example.and.coup;

import android.content.Context;
import android.content.DialogInterface;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Lior on 8/25/2017.
 */

/*
This Generic class will handle the retrive and update data from any generic database.
 */
public class DatabsaeUtill {

    //static instance of firebase database
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    private static DatabaseReference ref = database.getReference();
    private static Coupon cop;
    private static Shop shop;

    public static void writeToDatabase_coupon(Coupon data) {
        ref.child(data.getId()).setValue(data);
    }
    public static void updateDataToFirebase(Coupon qset) {
        String key = ref.push().getKey();
        qset.setId(key);
        ref.child(key).setValue(qset);
    }
    public static Coupon readCouponFromDatabase(final String id) {
        ref = ref.child(id);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cop = dataSnapshot.getValue(Coupon.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
        return cop;
    }


    /***************************************************************************/
    public static void writeToDatabase_shop(Shop data) {
        ref.child(data.getId()).setValue(data);
    }
    public static void updateDataToFirebase(Shop qset) {
        String key = ref.push().getKey();
        qset.setId(key);
        ref.child(key).setValue(qset);
    }
    public static Shop readShopFromDatabase(final String id) {
        ref = ref.child(id);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                shop = dataSnapshot.getValue(Shop.class);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
        return shop;
    }


}