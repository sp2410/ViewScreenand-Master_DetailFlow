package com.example.sangeeta.hw2;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Movie_List extends Fragment {

    Button x1;
    Button x2;
    Button x3;
    Button y1;
    Button y2;
    Button y3;
    boolean twopane;
    public Movie_List() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment1,
                container, false);


        if (getActivity(). findViewById(R.id.andcont3) !=null){
            twopane= true;
        }

        return inflater.inflate(R.layout.fragment_movie__list, container, false);

    }

    public void onActivityCreated(Bundle savedInstancesState) {
        super.onActivityCreated(savedInstancesState);


        Button x1=(Button) getActivity().findViewById(R.id.avatar);
        Button x2=(Button) getActivity().findViewById(R.id.titanic);
        Button x3=(Button) getActivity().findViewById(R.id.avenger);
        Button y1=(Button) getActivity().findViewById(R.id.knight);
        Button y2=(Button) getActivity().findViewById(R.id.star);
        Button y3=(Button) getActivity().findViewById(R.id.star2);



        if (twopane) {
            x1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Moviefragment fraga = new Moviefragment();
                    fragmentTransaction.replace(R.id.andcont3, fraga);
                    fragmentTransaction.commit();




                }
            });
            x2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie1 fragb = new movie1();
                    fragmentTransaction.add(R.id.andcont3, fragb);
                    fragmentTransaction.commit();


                }
            });
            x3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie2 fragc = new movie2();
                    fragmentTransaction.replace(R.id.andcont3, fragc);
                    fragmentTransaction.commit();


                }
            });
            y1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie3 fragd = new movie3();
                    fragmentTransaction.replace(R.id.andcont3, fragd);
                    fragmentTransaction.commit();


                }
            });
            y2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie4 frage = new movie4();
                    fragmentTransaction.replace(R.id.andcont3, frage);
                    fragmentTransaction.commit();


                }
            });
            y3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie5 fragf = new movie5();
                    fragmentTransaction.replace(R.id.andcont3, fragf);
                    fragmentTransaction.commit();



                }
            });
        } else {
            x1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Moviefragment fraga = new Moviefragment();
                    fragmentTransaction.replace(R.id.andcont2, fraga);
                    fragmentTransaction.commit();



                }
            });
            x2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie1 fragb = new movie1();
                    fragmentTransaction.replace(R.id.andcont2, fragb);
                    fragmentTransaction.commit();


                }
            });
            x3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie2 fragc = new movie2();
                    fragmentTransaction.replace(R.id.andcont2, fragc);
                    fragmentTransaction.commit();



                }
            });
            y1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie3 fragd = new movie3();
                    fragmentTransaction.replace(R.id.andcont2, fragd);
                    fragmentTransaction.commit();


                }
            });
            y2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie4 frage = new movie4();
                    fragmentTransaction.replace(R.id.andcont2, frage);
                    fragmentTransaction.commit();

                }
            });
            y3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    movie5 fragf = new movie5();
                    fragmentTransaction.replace(R.id.andcont2, fragf);
                    fragmentTransaction.commit();

                }
            });
        }




    }

}

