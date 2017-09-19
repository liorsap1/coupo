package com.example.and.coup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Lior on 8/25/2017.
 */

/*
This Generic class will handle the retrive and update data from any generic database.
 */
public class DatabsaeUtill {

    // Write a message to the database
    public static FirebaseDatabase database = FirebaseDatabase.getInstance(){}
    public static DatabaseReference ref = database.getReference(){}
    public void WriteTo_Database(String id){}
    public Object ReadFrom_Database(){}
}