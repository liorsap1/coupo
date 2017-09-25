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
    //static instance of FireBase database
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    private static DatabaseReference refCoupons = database.getReference("Coupons");
    private static DatabaseReference refShops = database.getReference("Shops");
    private static DatabaseReference refSales = database.getReference("Sales");
    private static DatabaseReference refUsers = database.getReference("Users");
    private static Coupon cop;
    private static Shop shop;
    private static Sale sale;
    private static User user;


    /***************************   COUPON   ************************************/


    public static void writeToDatabase_coupon(Coupon data) {
        refCoupons.child(data.getId()).setValue(data);
    }

    public static void updateDataToFirebase(Coupon qset) {
        String key = refCoupons.push().getKey();
        qset.setId(key);
        refCoupons.child(key).setValue(qset);
    }

    public static Coupon readCouponFromDatabase(final String id) {
        refCoupons = refCoupons.child(id);
        refCoupons.addValueEventListener(new ValueEventListener() {
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


    /***************************   SHOP   ************************************/
    public static void writeToDatabase_shop(Shop data) {
        refShops.child(data.getId()).setValue(data);
    }

    public static void updateDataToFirebase(Shop shp) {
        String key = refShops.push().getKey();
        shp.setId(key);
        refShops.child(key).setValue(shp);
    }

    public static Shop readShopFromDatabase(final String id) {
        refShops = refShops.child(id);
        refShops.addValueEventListener(new ValueEventListener() {
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


    /*******************************   SALE   ***********************************/
    public static void writeToDatabase_Sale(Sale data) {
        refSales.child(data.getId()).setValue(data);
    }

    public static void updateDataToFirebase(Sale sales) {
        String key = refSales.push().getKey();
        sales.setId(key);
        refSales.child(key).setValue(sales);
    }

    public static Sale readSaleFromDatabase(final String id) {
        refSales = refSales.child(id);
        refSales.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                sale = dataSnapshot.getValue(Sale.class);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
        return sale;
    }

    /*******************************   USER   ***********************************/
    public static void writeToDatabase_user(User data) {
        refUsers.child(data.getId()).setValue(data);
    }

    public static void updateDataToFirebase(User usr) {
        String key = refUsers.push().getKey();
        usr.setId(key);
        refUsers.child(key).setValue(usr);
    }

    public static User readUserFromDatabase(final String id) {
        refUsers = refUsers.child(id);
        refUsers.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                user = dataSnapshot.getValue(User.class);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
        return user;
    }
}