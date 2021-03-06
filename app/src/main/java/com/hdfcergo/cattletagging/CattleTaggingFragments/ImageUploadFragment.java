package com.hdfcergo.cattletagging.CattleTaggingFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hdfcergo.cattletagging.R;

/**
 * Created by davesuda on 2/11/2016.
 */
public class ImageUploadFragment extends Fragment {

    ImageView back;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_imageupload, container, false);

        initializeControls();
        return view;


    }

    private void initializeControls() {


        back = (ImageView) view.findViewById(R.id.backward);
        back.setVisibility(View.VISIBLE);
    }
}