package com.exemple.fragmenttofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

   TextView first,last;

    public Fragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        first = view.findViewById(R.id.first);
        last = view.findViewById(R.id.last);
        // get data from bundle
        Bundle bundle = getArguments();
        String firstname = bundle.getString("fname");
        String lastname = bundle.getString("lname");
        first.setText(firstname);
        last.setText(lastname);
        return view;
    }
}