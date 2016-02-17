package com.hdfcergo.cattletagging.CattleTaggingFragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.hdfcergo.cattletagging.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

/**
 * Created by davesuda on 2/11/2016.
 */
public class DetailViewFragment extends Fragment{



    private View rootView;
    private Context mContext;
    ArrayAdapter<String> adapter;
    private String[] species = {"Status 1","Status 2"};
    private String[] animalBreed = {"breed 1","breed 2"};
    private String[] breedType = {"breed type 1","breeed type 2","breed type 3"};
    private String[] approAge = {"20","30","40"};

    private String[] milk= {"1 lt"," 5 lt"," 7 lt "};

    private String[] location= {"1","5","7"};



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


         rootView = inflater.inflate(R.layout.fragment_details, container, false);

        initializeViews();
        return rootView;



    }

    private void initializeViews() {

        mContext = rootView.getContext();
        MaterialBetterSpinner spinner = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_species);
        MaterialBetterSpinner spinner_animalbreed = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_animalbreeed);
        MaterialBetterSpinner spinner_breedtype = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_breedtype);
        MaterialBetterSpinner spinner_age = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_age);
        MaterialBetterSpinner spinner_milk = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_milk);
        MaterialBetterSpinner spinner_location = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_location);

        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, species);
        spinner.setAdapter(adapter);


        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, animalBreed);
        spinner_animalbreed.setAdapter(adapter);


        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, breedType);
        spinner_breedtype.setAdapter(adapter);


        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, approAge);
        spinner_age.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, milk);
        spinner_milk.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, location);
        spinner_location.setAdapter(adapter);




    }
}
