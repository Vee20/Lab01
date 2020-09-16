package com.example.myfirstapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragment_Text extends Fragment {

    public Fragment_Text() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        Toast.makeText(getContext(),"Text Fragment OnStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getContext(),"Text Fragment OnCreateView", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment__text, container, false);
    }
}