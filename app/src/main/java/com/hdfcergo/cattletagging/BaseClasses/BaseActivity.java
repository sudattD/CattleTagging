package com.hdfcergo.cattletagging.BaseClasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hdfcergo.cattletagging.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }



    protected abstract int getLayoutId();

    protected abstract void  initViews();

    protected abstract void initData();


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
