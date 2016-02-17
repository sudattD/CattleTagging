package com.hdfcergo.cattletagging.CattleTaggingFragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.hdfcergo.cattletagging.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

/**
 * Created by davesuda on 2/11/2016.
 */
public class StatusFragment extends Fragment  {


    Spinner spinner;
    Context mContext;
    private View view;
    ArrayAdapter<String> adapter;
    private String[] statusType = {"Status 1","Status 2"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_status, container, false);

       // spinner =(Spinner) view.findViewById(R.id.spinner);
        initializeViews();
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    private void initializeViews() {


        mContext = view.getContext();
        //spinner.setOnItemSelectedListener(mContext);

        MaterialBetterSpinner spinner = (MaterialBetterSpinner)view.findViewById(R.id.spinner_status);
        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, statusType);
        spinner.setAdapter(adapter);


    }


}
