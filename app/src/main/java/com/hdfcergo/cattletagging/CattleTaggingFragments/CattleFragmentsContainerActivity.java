package com.hdfcergo.cattletagging.CattleTaggingFragments;

import android.content.Context;
import android.media.Image;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.hdfcergo.cattletagging.R;

public class CattleFragmentsContainerActivity extends AppCompatActivity  {


    private FrameLayout frameLayout;
    private Context mContext;
    private StatusFragment mStatusFragment;
    FragmentTransaction ft;

    ImageView status,details,imageUpload;

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

            status.setImageResource(R.drawable.status_over);

        }
    }

    private void initializeViews() {
            mContext = this;
         ft = getSupportFragmentManager().beginTransaction();
        frameLayout = (FrameLayout) findViewById(R.id.frameContainer);

        status = (ImageView) findViewById(R.id.img_status);
       // details = (ImageView) findViewById(R.id.img_details);
        //imageUpload = (ImageView) findViewById(R.id.img_imageUpload);


    }



    public void onStatusFrag(View v)
    {
        Fragment fragment = null;
        FragmentManager fragmentManager;
        fragment = new StatusFragment();
        fragmentManager = CattleFragmentsContainerActivity.this.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameContainer, fragment).commit();

        status.setImageResource(R.drawable.status_over);
        details.setImageResource(R.drawable.detail);
        imageUpload.setImageResource(R.drawable.image);
    }


    public void detailsFrag(View v)
    {
        Fragment fragment = null;
        FragmentManager fragmentManager;
        fragment = new DetailViewFragment();
        fragmentManager = CattleFragmentsContainerActivity.this.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameContainer, fragment).commit();

        details.setImageResource(R.drawable.detail_over);
        status.setImageResource(R.drawable.status);
        imageUpload.setImageResource(R.drawable.image);


    }

    public void imageUploadFrag(View v)
    {
        Fragment fragment = null;
        FragmentManager fragmentManager;
        fragment = new ImageUploadFragment();
        fragmentManager = CattleFragmentsContainerActivity.this.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameContainer, fragment).commit();
        imageUpload.setImageResource(R.drawable.image_over);

        details.setImageResource(R.drawable.detail);
        status.setImageResource(R.drawable.status);
    }

    public void signatureFrag(View v)
    {

    }


}
