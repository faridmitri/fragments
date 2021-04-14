package com.exemple.fragmenttoactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {

EditText name;
Button show;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_1, container, false);
        name = view.findViewById(R.id.edittxt);
        show = view.findViewById(R.id.Show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yourname = name.getText().toString();

                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.getData(yourname);
            }
        });
        return view;
    }
}