package com.example.sangeeta.hw2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class movie1 extends Fragment {
    ImageView imgv1;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    RatingBar R1;
    MovieData movieData;
    int i=1;
    int imageid;
    String a,b,c,d;
    Double e;

    public movie1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_moviefragment, container, false);
    }
    public void onActivityCreated(Bundle savedInstancesState) {
        super.onActivityCreated(savedInstancesState);



        ImageView imgv1 = (ImageView) getActivity().findViewById(R.id.imageView);
        TextView t1 = (TextView) getActivity().findViewById(R.id.textView);
        TextView t2 = (TextView) getActivity().findViewById(R.id.textView2);
        TextView t3 = (TextView) getActivity().findViewById(R.id.editText);
        TextView t4 = (TextView) getActivity().findViewById(R.id.textView3);
        RatingBar R1 = (RatingBar) getActivity().findViewById(R.id.ratingBar);



        movieData = new MovieData();
        HashMap movie = movieData.getItem(i);

        imageid = (Integer) movie.get("image");
        imgv1.setImageResource(imageid);

        a= (String) movie.get("name");
        t1.setText(a);

        b= (String) movie.get("year");
        t2.setText(b);

        c= (String) movie.get("description");
        t4.setText(c);

        d= (String) movie.get("stars");
        t3.setText(d);

        e= (Double) movie.get("rating");
        R1.setRating(((Double) (e / 2D)).floatValue());

    }


}
