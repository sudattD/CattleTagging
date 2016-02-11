package com.hdfcergo.cattletagging.CattleTaggingFragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.hdfcergo.cattletagging.R;

public class CattleFragmentsContainerActivity extends AppCompatActivity  {


    private FrameLayout frameLayout;
    private Context mContext;
    private StatusFragment mStatusFragment;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cattle_fragments_container);


        initializeViews();


        if(savedInstanceState==null)
        {
            Fragment fragment = null;
            FragmentManager fragmentManager;
            fragment = new StatusFragment();
            fragmentManager = CattleFragmentsContainerActivity.this.getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frameContainer, fragment).commit();

        }
    }

    private void initializeViews() {
            mContext = this;
         ft = getSupportFragmentManager().beginTransaction();
        frameLayout = (FrameLayout) findViewById(R.id.frameContainer);


    }



    public void onStatusFrag(View v)
    {
        Fragment fragment = null;
        FragmentManager fragmentManager;
        fragment = new StatusFragment();
        fragmentManager = CattleFragmentsContainerActivity.this.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameContainer, fragment).commit();
    }


    public void detailsFrag(View v)
    {
        Fragment fragment = null;
        FragmentManager fragmentManager;
        fragment = new DetailViewFragment();
        fragmentManager = CattleFragmentsContainerActivity.this.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameContainer, fragment).commit();
    }

    public void imageUploadFrag(View v)
    {

    }

    public void signatureFrag(View v)
    {

    }


}
