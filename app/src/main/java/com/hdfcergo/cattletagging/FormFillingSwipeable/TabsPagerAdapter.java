package com.hdfcergo.cattletagging.FormFillingSwipeable;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.hdfcergo.cattletagging.CattleTaggingFragments.DetailViewFragment;
import com.hdfcergo.cattletagging.CattleTaggingFragments.ImageUploadFragment;
import com.hdfcergo.cattletagging.CattleTaggingFragments.StatusFragment;

/**
 * Created by davesuda on 2/17/2016.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new StatusFragment();
            case 1:
                // Games fragment activity
                return new DetailViewFragment();
            case 2:
                // Movies fragment activity
                return new ImageUploadFragment();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}
