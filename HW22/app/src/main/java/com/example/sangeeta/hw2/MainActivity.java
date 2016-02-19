package com.example.sangeeta.hw2;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;


public class MainActivity extends android.support.v4.app.FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BlankFragment1 frag1 = new BlankFragment1();
        fragmentTransaction.add(R.id.andcont, frag1);
        fragmentTransaction.commit();



    }
    @Override
    public void onBackPressed() {
        super.onBackPressed(); // allows standard use of backbutton for page 1
    }
}

