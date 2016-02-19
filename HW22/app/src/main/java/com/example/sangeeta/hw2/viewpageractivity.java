package com.example.sangeeta.hw2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;


public class viewpageractivity extends FragmentActivity {

    Fragment screens[];
    int j;
    ViewPager pager;


    int idnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCompat.postponeEnterTransition(this);

        setContentView(R.layout.activity_viewpageractivity);
        pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }



    private class MyPagerAdapter extends FragmentPagerAdapter {
        //int count;
        public MyPagerAdapter(FragmentManager fm) {

            super(fm);

            screens = new Fragment[7];

            screens[0] = new Moviefragment();
            screens[1] = new movie1();
            screens[2] = new movie2();
            screens[3] = new movie3();
            screens[4] = new movie4();
            screens[5] = new movie5();
            screens[6] = new movie6();

        }



        @Override
        public Fragment getItem(int pos) {
            //j= pos--;
            //pos--;
            if(pos <= screens.length)
            {
                return screens[pos];
            }
            return null;
        }

        private void initPages(){


        }

        @Override
        public int getCount() {
            return screens.length;
        }



    }


}
