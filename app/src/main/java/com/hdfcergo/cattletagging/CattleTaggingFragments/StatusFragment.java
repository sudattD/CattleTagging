package com.hdfcergo.cattletagging.CattleTaggingFragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hdfcergo.cattletagging.R;

/**
 * Created by davesuda on 2/11/2016.
 */
public class StatusFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_status, container, false);
        return rootView;
    }
}
