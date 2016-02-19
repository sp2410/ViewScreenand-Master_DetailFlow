package com.example.sangeeta.hw2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class masterdetailflow extends android.support.v4.app.FragmentActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masterdetailflow);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Movie_List fragx = new Movie_List();
        fragmentTransaction.replace(R.id.andcont2, fragx);
        fragmentTransaction.commit();



}
    public void onBackPressed() {

            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Movie_List fragx = new Movie_List();
            fragmentTransaction.replace(R.id.andcont2, fragx);
            fragmentTransaction.commit();
           


    }


}
