package com.example.sangeeta.hw2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment1 extends Fragment{

    Button b1;
    Button c1;
    Button d1;

    public BlankFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment1,
                container, false);

        return inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
    }
    public void onActivityCreated(Bundle savedInstancesState){
        super.onActivityCreated(savedInstancesState);

        Button b1 = (Button) getActivity().findViewById(R.id.aboutme);
        Button c1 = (Button) getActivity().findViewById(R.id.task1);
        Button d1 = (Button) getActivity().findViewById(R.id.task2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                BlankFragment2 frag2 = new BlankFragment2();
                fragmentTransaction.add(R.id.andcont, frag2);
                fragmentTransaction.commit();



            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(getActivity(), viewpageractivity.class);
                getActivity().startActivity(myIntent);

            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(getActivity(), masterdetailflow.class);
                getActivity().startActivity(myIntent);

            }
        });



    }

}
