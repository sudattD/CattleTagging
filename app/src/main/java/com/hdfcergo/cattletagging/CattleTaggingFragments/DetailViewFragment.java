package com.hdfcergo.cattletagging.CattleTaggingFragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdfcergo.cattletagging.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

/**
 * Created by davesuda on 2/11/2016.
 */
public class DetailViewFragment extends Fragment{

    TextView tvCow,tvBuffalo,tvOthers,tvCross,tvExotic,tvIndigenious;
    boolean isCow  = false,isBuffalo = false,isOthers = false;
    boolean isCross=false,isExotic=false,isIndigenious=false;

    private View rootView;
    private Context mContext;
    ArrayAdapter<String> adapter;
    private String[] approAge = {"20","30","40"};
    private String[] milk= {"1 lt"," 5 lt"," 7 lt "};
    private String[] location= {"1","5","7"};

    ImageView back,forward;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_details, container, false);
        initializeViews();
        return rootView;

    }

    private void initializeViews() {

        mContext = rootView.getContext();
        back =(ImageView) rootView.findViewById(R.id.backward);
        forward = (ImageView) rootView.findViewById(R.id.forward);

        //for species
        tvCow= (TextView) rootView.findViewById(R.id.tv_cow);
        tvCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isCow) {

                    tvCow.setTextColor(Color.parseColor("#ffffff"));
                    tvCow.setBackgroundResource(R.drawable.curve_sharp);

                    tvBuffalo.setTextColor(Color.parseColor("#838383"));
                    tvBuffalo.setBackgroundResource(R.drawable.bg_greyish);

                    tvOthers.setTextColor(Color.parseColor("#838383"));
                    tvOthers.setBackgroundResource(R.drawable.bg_greyish);

                    isCow = true;
                    isBuffalo=false;
                    isOthers=false;
                }
                else
                {
                    tvCow.setTextColor(Color.parseColor("#838383"));  //unselected
                    tvCow.setBackgroundResource(R.drawable.bg_greyish); //unselected
                    isCow = false;
                }
            }
        });

        tvBuffalo=(TextView) rootView.findViewById(R.id.tv_buffalo);
        tvBuffalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isBuffalo)
                {
                    tvBuffalo.setTextColor(Color.parseColor("#ffffff"));
                    tvBuffalo.setBackgroundResource(R.drawable.curve_sharp);

                    tvCow.setTextColor(Color.parseColor("#838383"));
                    tvCow.setBackgroundResource(R.drawable.bg_greyish);

                    tvOthers.setTextColor(Color.parseColor("#838383"));
                    tvOthers.setBackgroundResource(R.drawable.bg_greyish);

                    isBuffalo = true;
                    isCow=false;
                    isOthers=false;
                }
                else
                {
                    tvBuffalo.setTextColor(Color.parseColor("#838383"));  //unselected
                    tvBuffalo.setBackgroundResource(R.drawable.bg_greyish); //unselected
                    isBuffalo = false;
                }
            }
        });

        tvOthers=(TextView) rootView.findViewById(R.id.tv_others);
        tvOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isOthers) {

                    tvOthers.setTextColor(Color.parseColor("#ffffff"));
                    tvOthers.setBackgroundResource(R.drawable.curve_sharp);

                    tvCow.setTextColor(Color.parseColor("#838383"));
                    tvCow.setBackgroundResource(R.drawable.bg_greyish);

                    tvBuffalo.setTextColor(Color.parseColor("#838383"));
                    tvBuffalo.setBackgroundResource(R.drawable.bg_greyish);

                    isOthers = true;
                    isCow=false;
                    isBuffalo=false;
                }
                else
                {
                    tvOthers.setTextColor(Color.parseColor("#838383"));  //unselected
                    tvOthers.setBackgroundResource(R.drawable.bg_greyish); //unselected
                    isOthers = false;
                }
            }
        });

        //for animal breed

        //for breed type
        tvCross=(TextView) rootView.findViewById(R.id.tv_cross);
        tvCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isCross)
                {
                    tvCross.setTextColor(Color.parseColor("#ffffff"));
                    tvCross.setBackgroundResource(R.drawable.curve_sharp);

                    tvExotic.setTextColor(Color.parseColor("#838383"));
                    tvExotic.setBackgroundResource(R.drawable.bg_greyish);

                    tvIndigenious.setTextColor(Color.parseColor("#838383"));
                    tvIndigenious.setBackgroundResource(R.drawable.bg_greyish);

                    isCross = true;
                    isExotic=false;
                    isIndigenious=false;
                }
                else
                {
                    tvCross.setTextColor(Color.parseColor("#838383"));  //unselected
                    tvCross.setBackgroundResource(R.drawable.bg_greyish); //unselected
                    isCross = false;
                }
            }
        });

        tvExotic=(TextView) rootView.findViewById(R.id.tv_exotic);
        tvExotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isExotic)
                {
                    tvExotic.setTextColor(Color.parseColor("#ffffff"));
                    tvExotic.setBackgroundResource(R.drawable.curve_sharp);

                    tvCross.setTextColor(Color.parseColor("#838383"));
                    tvCross.setBackgroundResource(R.drawable.bg_greyish);

                    tvIndigenious.setTextColor(Color.parseColor("#838383"));
                    tvIndigenious.setBackgroundResource(R.drawable.bg_greyish);

                    isExotic = true;
                    isCross=false;
                    isIndigenious=false;
                }
                else
                {
                    tvExotic.setTextColor(Color.parseColor("#838383"));  //unselected
                    tvExotic.setBackgroundResource(R.drawable.bg_greyish); //unselected
                    isExotic = false;
                }
            }
        });

        tvIndigenious=(TextView) rootView.findViewById(R.id.tv_indigenous);
        tvIndigenious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isIndigenious)
                {
                    tvIndigenious.setTextColor(Color.parseColor("#ffffff"));
                    tvIndigenious.setBackgroundResource(R.drawable.curve_sharp);

                    tvCross.setTextColor(Color.parseColor("#838383"));
                    tvCross.setBackgroundResource(R.drawable.bg_greyish);

                    tvExotic.setTextColor(Color.parseColor("#838383"));
                    tvExotic.setBackgroundResource(R.drawable.bg_greyish);

                    isIndigenious = true;
                    isCross=false;
                    isExotic=false;
                }
                else
                {
                    tvIndigenious.setTextColor(Color.parseColor("#838383"));  //unselected
                    tvIndigenious.setBackgroundResource(R.drawable.bg_greyish); //unselected
                    isIndigenious = false;
                }
            }
        });

        MaterialBetterSpinner spinner_age = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_age);
        MaterialBetterSpinner spinner_milk = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_milk);
        MaterialBetterSpinner spinner_location = (MaterialBetterSpinner)rootView.findViewById(R.id.spinner_location);


        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, approAge);
        spinner_age.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, milk);
        spinner_milk.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(getActivity(),  R.layout.spinner_layout, location);
        spinner_location.setAdapter(adapter);


        back.setVisibility(View.VISIBLE);
        forward.setVisibility(View.VISIBLE);

    }
}
