package com.hdfcergo.cattletagging.DashBoard;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;

public class DashBoardActivity extends AppCompatActivity {


    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager llm;
    private Context mContext;
    private Toolbar toolbar;

    ArrayList<DashboardDataDummy> recyclerViewData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_screen);


        initializeViews();
    }

    private void initializeViews() {


        mContext = this;
        recyclerViewData = new ArrayList<DashboardDataDummy>();
        recyclerViewData.add(new DashboardDataDummy("Village - Mahar Kala","Taluka - Chomu","4 leads/ 22 cattles","10","22"));
        recyclerViewData.add(new DashboardDataDummy("Village - Manda Bhinda","Taluka - Chomu","3 leads/ 12 cattles","4","10"));
        recyclerViewData.add(new DashboardDataDummy("Village - Deesa","Taluka - Chomu","2 leads/ 15 cattles","6","12"));
        recyclerViewData.add(new DashboardDataDummy("Village - Jasara","Taluka - Deesa","1 leads/ 9 cattles","5","15"));
        recyclerViewData.add(new DashboardDataDummy("Village - Kasauli","Taluka - Deesa","1 leads/ 20 cattles","11","16"));

        recyclerViewData.add(new DashboardDataDummy("Village - Mahar Kala","Taluka - Chomu","4 leads/ 22 cattles","10","22"));
        recyclerViewData.add(new DashboardDataDummy("Village - Manda Bhinda","Taluka - Chomu","3 leads/ 12 cattles","4","10"));
        recyclerViewData.add(new DashboardDataDummy("Village - Deesa","Taluka - Chomu","2 leads/ 15 cattles","6","12"));
        recyclerViewData.add(new DashboardDataDummy("Village - Jasara","Taluka - Deesa","1 leads/ 9 cattles","5","15"));
        recyclerViewData.add(new DashboardDataDummy("Village - Kasauli","Taluka - Deesa","1 leads/ 20 cattles","11","16"));


        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);




        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);


        DashBoardAdapter adapter = new DashBoardAdapter(recyclerViewData,mContext);
        rv.setAdapter(adapter);

        //mAdapter = new DashBoardAdapter(myDataset);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard_menu, menu);
        return true;
    }
}
