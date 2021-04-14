package com.exemple.fragmenttofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {

EditText firstname,lastname;
Button submit;

    public Fragment1(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        // declare IDs
        firstname = view.findViewById(R.id.firstname);
        lastname = view.findViewById(R.id.lastname);
        submit = view.findViewById(R.id.submit);

        // on submit button click
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = firstname.getText().toString();
                String lname = lastname.getText().toString();

                // put data in bundle
                Bundle bundle = new Bundle();
                bundle.putString("fname",fname);
                bundle.putString("lname",lname);

                // transaction to seconnd fragment fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                // send dada to second fragment
                fragment2.setArguments(bundle);
                fragmentTransaction.replace(R.id.frag1,fragment2);
                fragmentTransaction.commit();
            }
        });
        return  view;
    }
}