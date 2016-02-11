package com.hdfcergo.cattletagging.LeadDetails;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import com.hdfcergo.cattletagging.DashBoard.DashBoardAdapter;
import com.hdfcergo.cattletagging.DashBoard.DashboardDataDummy;
import com.hdfcergo.cattletagging.R;

import java.util.ArrayList;

public class LeadDetailActivity extends AppCompatActivity {


    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager llm;
    private Context mContext;

    ArrayList<LeadDataDummy> recyclerViewData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead_detail_screens);

        initializeViews();
    }

    private void initializeViews() {

        mContext = this;
        recyclerViewData = new ArrayList<LeadDataDummy>();
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Dada Bhai Pathan","Loan Account number - 00xx5674532","Lead number - CT88765432","Lead Generated Date - 09/07/2015","No. of cattles - 2 Tat : 24 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));
        recyclerViewData.add(new LeadDataDummy("Beneficiery - Kareem Lala","Loan Account number - 00xx4874532","Lead number - CT546789","Lead Generated Date - 19/01/2015","No. of cattles - 14 Tat : 12 hrs"));



        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);

        LeadDetailsAdapter adapter = new LeadDetailsAdapter(recyclerViewData,mContext);
        rv.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.leaddetails_menu, menu);
        return true;
    }
}
