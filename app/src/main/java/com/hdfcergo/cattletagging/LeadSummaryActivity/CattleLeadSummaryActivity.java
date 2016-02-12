package com.hdfcergo.cattletagging.LeadSummaryActivity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import com.hdfcergo.cattletagging.DashBoard.DashBoardAdapter;
import com.hdfcergo.cattletagging.DashBoard.DashboardDataDummy;
import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;

public class CattleLeadSummaryActivity extends AppCompatActivity {


    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager llm;
    private Context mContext;
    ArrayList<LeadCattleData> recyclerViewData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cattle_lead_summary);
        
        
        initializeView();


    }

    private void initializeView() {


        mContext = this;
        recyclerViewData = new ArrayList<LeadCattleData>();
        recyclerViewData.add(new LeadCattleData("Cattle 1",R.drawable.eye));
        recyclerViewData.add(new LeadCattleData("Cattle 2",R.drawable.eye));
        recyclerViewData.add(new LeadCattleData("Cattle 3",R.drawable.eye));
        recyclerViewData.add(new LeadCattleData("Cattle 4",R.drawable.eye));
        recyclerViewData.add(new LeadCattleData("Cattle 5",R.drawable.eye));
        recyclerViewData.add(new LeadCattleData("Cattle 6",R.drawable.eye));
        recyclerViewData.add(new LeadCattleData("Cattle 7",R.drawable.eye));
        recyclerViewData.add(new LeadCattleData("Cattle 8",R.drawable.eye));


        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);




        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);


        LeadCattleAdapter adapter = new LeadCattleAdapter(recyclerViewData,mContext);
        rv.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cattlelead_menu, menu);
        return true;
    }
}
