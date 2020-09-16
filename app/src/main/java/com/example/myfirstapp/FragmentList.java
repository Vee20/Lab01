package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FragmentList extends Fragment {
ListView LV;

SearchView SV;
ArrayAdapter<String> Adapter;
String[] activityNames = {getString(R.string.AIActivity), getString(R.string.VRActivity)};

    public FragmentList() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        Toast.makeText(getContext(), R.string.LVOnStart, Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getContext(), R.string.LVOnCreate, Toast.LENGTH_SHORT).show();
        View view = inflater.inflate(R.layout.fragment_list, container);
        LV = (ListView) view.findViewById(R.id.listView);
        Adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, activityNames);
        LV.setAdapter(Adapter);
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent AI  = new Intent(getActivity(), AIActivity.class);
                    startActivity(AI);
                } else if(position == 1){
                    Intent VR = new Intent(getActivity(), VRActivity.class);
                    startActivity(VR);
                }
            }
        });

        return view;
    }
}