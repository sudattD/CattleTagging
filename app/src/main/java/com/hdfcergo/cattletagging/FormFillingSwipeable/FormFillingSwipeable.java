package com.hdfcergo.cattletagging.FormFillingSwipeable;



import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.hdfcergo.cattletagging.CattleTaggingFragments.DetailViewFragment;
import com.hdfcergo.cattletagging.CattleTaggingFragments.ImageUploadFragment;
import com.hdfcergo.cattletagging.CattleTaggingFragments.StatusFragment;
import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;
import java.util.List;

public class FormFillingSwipeable extends AppCompatActivity  {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    ActionBar actionbar;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lead_summary_swipable);
      // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       //setSupportActionBar(toolbar);

       // actionbar = getSupportActionBar();
       // actionbar.setDisplayHomeAsUpEnabled(true);
        bundle = getIntent().getExtras();
        getSupportActionBar().setTitle(bundle.getString("cattle"));
        getSupportActionBar().setSubtitle(bundle.getString("lead"));
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //getResources().getDrawable(R.drawable.tab1)
        adapter.addFragment(new StatusFragment(),"status");
        adapter.addFragment(new DetailViewFragment(), "Details");
        adapter.addFragment(new ImageUploadFragment(), "Image");
       // adapter.addFragment(new TopRatedFragment(), "Sign");



        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {


        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            return mFragmentTitleList.get(position);
        }
    }
}
